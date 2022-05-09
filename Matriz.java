package vetores;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		
		for(int linha=0; linha<matriz.length; linha++) {
			for (int coluna=0; coluna<matriz[0].length; coluna++) {
				System.out.print("Digite um número: ");
				matriz[linha][coluna] = ler.nextInt();
			}
		}
		for(int linha=0; linha<matriz.length; linha++) {
			for (int coluna=0; coluna<matriz[0].length; coluna++) {
				System.out.println(matriz[linha][coluna] + " ^ 2 = " + (matriz[linha][coluna]*matriz[linha][coluna]));
			}
		}
	}
}
