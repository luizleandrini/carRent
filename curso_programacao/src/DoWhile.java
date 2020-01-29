import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resp;

		do {
			System.out.println("Digite a temperatura em Celcius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("Valor em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir a operação? (s/n)");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
	}

}
