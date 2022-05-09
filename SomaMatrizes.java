package vetores;

import java.util.Scanner;

public class SomaMatrizes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		
		double matriz1[][] = new double[3][2];
		Fixar(matriz1);
		double matriz2[][] = new double[3][2];
		Fixar(matriz2);
		double matriz3[][] = new double[3][2];
		SomarM(matriz1, matriz2, matriz3);
		

		for(int linha=0; linha<matriz3.length; linha++) {
			for(int coluna=0; coluna<matriz3[0].length; coluna++) {
				System.out.print(matriz3[linha][coluna] + "|");
				if(coluna == 3) {
					System.out.println();
				}
			}	
		}
	}
	public static void SomarM(double matriz1[][], double matriz2[][], double matriz3[][]) {
		for(int linha=0; linha<matriz3.length; linha++) {
			for(int coluna=0; coluna<matriz3[0].length; coluna++) {
				matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
			}	
		}
	}
	public static void Fixar(double matriz[][]) {
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				System.out.print("Escolha um número: ");
				matriz[linha][coluna] =  ler.nextDouble();	
			}
		}
	}
	
}


		
