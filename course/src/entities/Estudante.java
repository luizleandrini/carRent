package entities;

public class Estudante {

	public String nome;
	public double n1, n2, n3;
	
	public Estudante() {
		System.out.println("Estudante criado");
	}
	
	public Estudante(String nome) {
		this.nome = nome;
		System.out.println("Estudante criado");
	}
	
	public Estudante(double nota1, double n2, double notaFinal) {
		this.n1=nota1;
		this.n2=n2;
		this.n3=notaFinal;
		System.out.println("Estudante criado");
	}
	
	public double notaFinal(){
		return n1 + n2 + n3;
	}
	
	public double notaFaltando() {
		if(notaFinal()<60) {
			return 60 - notaFinal();
		}else {
			return 0.0;
		}
	}
}
