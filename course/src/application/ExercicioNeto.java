package application;

import java.util.Scanner;

import entities.Produto;

public class ExercicioNeto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o nome: ");
		String name = sc.nextLine();
		
		System.out.println("Entre com preço: ");
		double price = sc.nextDouble();
		
		System.out.println("enter com quantidado: ");
		int quantity = sc.nextInt();
		sc.close();

		Produto produto = new Produto(name, price, quantity);
		produto.
		
		
		double precoFinal = produto.getPrice() * produto.getQuantity();
		System.out.println(precoFinal);
		
	}

}
