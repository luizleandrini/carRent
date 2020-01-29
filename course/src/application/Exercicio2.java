package application;

import java.util.Scanner;

import entities.Estudante;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		
		System.out.println("Entre com o nome do estudante:");
		estudante.nome = sc.nextLine();
		System.out.println("Entre com as notas:");
		estudante.n1 = sc.nextDouble();
		estudante.n2 = sc.nextDouble();
		estudante.n3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", estudante.notaFinal());
		
		if(estudante.notaFinal() < 60) {
			System.out.println("Aluno reprovado");
			System.out.printf("Faltando %.2f pontos%n", estudante.notaFaltando());
		}else {
			System.out.println("Aluno aprovado!");
		}
		
		
		sc.close();
		
	}
	
}
