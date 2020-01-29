package entities;

public class Conta {

	private String name;
	private int numero;
	private double saldo;
	
	public Conta(String name, int conta) {
		super();
		this.name = name;
		this.numero = conta;
	}

	public Conta(String name, int conta, double depositoInicial) {
		super();
		this.name = name;
		this.numero = conta;
		deposito(depositoInicial);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConta() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double montante) {
		saldo += montante;
	}
	
	public void daque(double montante) {
		saldo -= montante + 5.0; // valor do saque + 5 reais da taxa de saque
	}

	@Override
	public String toString() {
		return "Conta [name=" + name + ", conta=" + numero + ", saldo=" + saldo + "]";
	}
	
}
