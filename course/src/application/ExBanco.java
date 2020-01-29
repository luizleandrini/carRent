package application;

import java.util.Scanner;

import entities.Conta;

public class ExBanco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta conta;
				
		System.out.println("Entre com o numero da conta: ");
		System.out.print("Conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do proprietario: ");
		System.out.println("Nome: ");

		String name = sc.nextLine();

		System.out.println("Tem deposito inicial? (s/n) ");
		char resposta = sc.next().charAt(0); // ler o caractere

		if (resposta == 's') {
			System.out.println("Entre com o valor inicial: ");
			double depositoInicial = sc.nextDouble(); // recebe o valor inicial
			conta = new Conta(name, conta, depositoInicial);
		} else {
			conta = new Conta(name, numeroConta);
		}

		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);

		System.out.println();
		System.out.println("Entre com o valor do deposito");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Entre com o valor do saque");
		double valorSaque = sc.nextDouble();
		conta.deposito(valorSaque);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);

		sc.close();

	}

}
