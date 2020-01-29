package application;

import java.util.Scanner;

import entities.VetProdutos;

public class VetorProdutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de produtos: ");
		int n = sc.nextInt();
		VetProdutos[] vet = new VetProdutos[n];
		
		for(int i=0; i<vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vet[i] = new VetProdutos(name, price);
		}
		
		double soma = 0;
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i].getPrice();
		}
		double media = soma / vet.length;
		System.out.println("Media de preço: " + media);
		
		sc.close();
		
	}
	
}
