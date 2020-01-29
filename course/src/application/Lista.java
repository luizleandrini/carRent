package application;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Luiz"); // adiciona um elemento na lista
		list.add("Maria");
		list.add("Bob");
		list.add("Ana");

		list.add(2, "Vrau"); // adiciona um novo elemento em determinado lugar da lista

		System.out.println(list.size()); // mostra quantos elementos tem na lista

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");

		list.remove("Ana"); // excluir determinado elemento da lista a partir da comparaçao dele com outro
		// list.remove(1); // remover por posiçao
		list.removeIf(x -> x.charAt(0) == 'M'); // remover por predicado (todo mundo que começa com letra M)
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		System.out.println("Index do bob: "+ list.indexOf("Bob")); // indica a posição do elemento
		System.out.println("Index do Marco: " + list.indexOf("Marco")); // quando nao existe o elemento retorna -1
		System.out.println("---------------------");
	}

}
