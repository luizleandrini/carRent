package application;

import java.util.Scanner;

import entities.Calculadora;

public class ExCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circunferencia(raio);
		
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("valor de PI: %.2f%n", Calculadora.PI);
				
				
				
		sc.close();
	}
	
}
