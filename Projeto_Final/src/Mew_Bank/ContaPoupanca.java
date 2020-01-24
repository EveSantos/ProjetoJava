package Mew_Bank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numConta) {
		super(numConta);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
}
