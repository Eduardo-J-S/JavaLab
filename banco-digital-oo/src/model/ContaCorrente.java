package model;

public class ContaCorrente extends Conta {
    private ContaPoupanca contaPoupancaVinculada;

    public ContaCorrente(Cliente cliente) {
		super(cliente);
        this.contaPoupancaVinculada = new ContaPoupanca(cliente, super.getNumero());
	}

    public ContaCorrente(Cliente cliente, int numero){
        super(cliente, numero);
        this.contaPoupancaVinculada = new ContaPoupanca(cliente, numero);
    }

    public ContaPoupanca getContaPoupancaVinculada() {
        return contaPoupancaVinculada;
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
