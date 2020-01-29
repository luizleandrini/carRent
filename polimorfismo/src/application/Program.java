package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.Tercerizado;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de funcionarios: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do #" + i + " funcinario");
			System.out.print("Funcionario tercerizado? (s/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.println("valor por hora: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 's') {
				System.out.print("Digite a taxa adicional: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new Tercerizado(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("Pagamentos: ");
		for(Employee emp : list){
			System.out.println(emp.getName()+ " -  $" + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
	}
}
