package Mew_Bank;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numConta) {
        super(numConta);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}
