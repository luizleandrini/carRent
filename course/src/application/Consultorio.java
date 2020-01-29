package application;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

import entities.FichaCadastro;

public class Consultorio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario;
		
		
		System.out.println("Nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("cpf: ");
		String identificador = sc.nextLine();
		
		System.out.println("email: ");
		String correio = sc.nextLine();
		
		
		
		System.out.println("deseja informar salario? (s/n) ");
		String resp = sc.nextLine();
		
		
		if(resp.equals("s")) {
			System.out.println("Salario: ");
			salario = sc.nextDouble();
			
		}
		
		sc.close();
		
		
		FichaCadastro ajsdg = new FichaCadastro(nomeCliente, identificador, correio);
		
		System.out.println(ajsdg.getNome());
		
		
//		System.out.println("nome: " +aj.getNome());
//		System.out.println("CPF: " + fichacadastro.getCpf());
//		System.out.println("email: " + fichacadastro.getEmail());
//		System.out.println("salario: " + fichacadastro.getSalario());
//		
		
		
	}

}
