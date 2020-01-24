package Mew_Bank;


import javax.swing.JOptionPane;

public abstract class Conta {

    protected double saldo;
    private int numConta;
    private Cliente titular ;
    private static int total = 0;

    public Conta(int numConta) {
        Conta.total++;
        this.numConta = numConta;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        if (numConta <= 0) {
            JOptionPane.showMessageDialog(null, "Número da Conta Inválido");
            return;
        }
        this.numConta = numConta;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}
