package application;

import java.util.Scanner;

public class AulaVetor {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos vetores deseja inserir: ");
		int n = sc.nextInt();
		double [] vet = new double [n];
		
		System.out.println("Entre com os valores: ");
		for(int i=0; i<n; i++) {
			vet [i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i =0; i<n; i++) {
			soma += vet[i];
		}
		double media = soma / n;
		
		System.out.println("Media de altura: " + media);
		
		sc.close();
		
	}
	
}
