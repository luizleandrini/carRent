package entities;

public class VetProdutos {

	private String nome;
	private double price;
	public VetProdutos(String nome, double price) {
		super();
		this.nome = nome;
		this.price = price;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
