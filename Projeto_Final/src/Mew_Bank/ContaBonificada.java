package Mew_Bank;

public class ContaBonificada extends Conta implements Bonificacao{

    private double bonus;
    
    public ContaBonificada(int numConta) {
        super(numConta);
    }

    @Override
    public void deposita(double valor) {
        bonus = (valor*0.01)+valor; 
        super.saldo += bonus ;
    }
     
}
