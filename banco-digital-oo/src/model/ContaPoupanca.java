package model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

    public ContaPoupanca(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
