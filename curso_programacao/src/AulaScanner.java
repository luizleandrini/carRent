import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
	/*	
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		System.out.println("digite os dados: ");
		
		x = sc.next(); // permite escrever uma palavra e ela vai ser armazenada na variavel x
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	*/
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
}
