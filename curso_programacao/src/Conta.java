import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos minutos");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		System.out.printf("Valor conta = R$ %.2f%n", conta);
	}
	
}
