package application;

import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Preço: ");
		double price = sc.nextInt();
			
		Produto produto = new Produto(name, price, 0);
		
		produto.setName ("computador");
		System.out.println("nome atualizado: " + produto.getName());
		produto.setPrice(900);
		System.out.println("preço atualizado: " + produto.getPrice());
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para ser adicionado ao estoque: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Novo estoque: " + produto);
		
		System.out.println();
		System.out.print("Entre com uma saida de estoque : ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Novo estoque " + produto);
		
		sc.close();
	}

}
