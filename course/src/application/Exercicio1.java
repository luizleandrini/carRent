package application;

import java.util.Scanner;

import entities.Empregado;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		System.out.println("Entre com os dados do empregado ");
		
		
		System.out.print("Nome: ");
		empregado.name= sc.nextLine();
		System.out.print("Salario bruto: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Empregado " + empregado);
		System.out.println();
		System.out.println("Qual a porcentagem para aumento no salario");
		double porcentagem = sc.nextDouble();
		empregado.increaseSalary(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + empregado);
		
		sc.close();
	}
	
}
