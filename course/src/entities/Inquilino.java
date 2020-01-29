package entities;

public class Inquilino {

	private int aluguel;
	private int quarto;
	private String nome;
	private String email;
	
	public Inquilino(int aluguel, int quarto, String nome, String email) {
		super();
		this.aluguel = aluguel;
		this.quarto = quarto;
		this.nome = nome;
		this.email = email;
	}
	public int getAluguel() {
		return aluguel;
	}
	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
