package model;

public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	private double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		//Usar synchronized garante que a variável SEQUENCIAL seja incrementada de forma segura em um ambiente multithread.
		synchronized (Conta.class) {
            this.numero = SEQUENCIAL++;
        }
		this.cliente = cliente;
	}

	public Conta(Cliente cliente, int numeroConta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = numeroConta;
        this.cliente = cliente;
    }

	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor do saque deve ser positivo.");
		} if(valor > saldo){
			throw new IllegalArgumentException("Saldo insuficiente!");
		}
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		if(valor <= 0){
			throw new IllegalArgumentException("Valor impossível de ser depositado!");
		}
		saldo += valor;

	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente!");
		} 
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor da transferência deve ser positivo.");
		}
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
        return cliente;
    }

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public void imprimirExtrato() {
		throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
	}
}