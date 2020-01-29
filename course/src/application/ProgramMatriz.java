package application;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int[n][n]; // essas chaves indicam o tamanho da matriz
		
		for(int i=0; i<mat.length; i++) {  //linhas horizontais
			for(int j =0; j<mat.length; j++) { //linhas verticais
				mat[i][j] = sc.nextInt();
			}
		}
				
		System.out.println("Diagonal princiapl");
		for(int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " "); // imprime a diagonal princiapl
		}
		System.out.println();
		
		int count = 0;
		for(int i= 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				if (mat [i][j] <0) {  // mostra quantos numeros negativos tem
					count ++;
				}
			}
		}
		System.out.println("numeros negativos: " + count);
				
		sc.close();
	}
	
}
