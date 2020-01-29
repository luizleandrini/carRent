package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios serao cadastrados? ");
		int n = sc.nextInt();
		Employee[] vet = new Employee[n];
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			int id = sc.nextInt();
			String nome = sc.nextLine();
			double salario = sc.nextDouble();
			vet[i] = new Employee(id, nome, salario);
		}
		
		
		sc.close();
		
	}
}
