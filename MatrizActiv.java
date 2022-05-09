package vetores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MatrizActiv {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		DecimalFormat numerosDec = new DecimalFormat("#.###");
		
		double nDecimais[][] = new double[3][4];
		double menor = 0;
		double media = 0;
		int o=1;
		
		for(int linha=0; linha<nDecimais.length; linha++) {
			for (int coluna=0; coluna<nDecimais[0].length; coluna++) {
				System.out.print("Digite um número: ");
				nDecimais[linha][coluna] = ler.nextDouble();
				menor = menor(nDecimais);
				media = mediaA(nDecimais);
			}
		}
		
		for(int linha=0; linha<nDecimais.length; linha++) {
			for (int coluna=0; coluna<nDecimais[0].length; coluna++) {
				System.out.print(nDecimais[linha][coluna] + " -- ");
				if(o == 3) {
					System.out.println();
				o = 0;
				}
				o++;
			}
		}
		System.out.println("Menor número " + menor + ", média: " + numerosDec.format(media));

	}
	public static double menor(double n1[][]) {
		double menorN = n1[0][0];
		
		for(int linha=0; linha<n1.length; linha++) {
			for (int coluna=0; coluna<n1[0].length; coluna++) {
				if(n1[linha][coluna] < menorN){
					menorN = n1[linha][coluna];
				}
			}
		}
		
		return menorN;
	}
	public static double mediaA(double n1[][]) {
		
	double total = 0;
	
	for(int linha=0; linha<n1.length; linha++) {
		for (int coluna=0; coluna<n1[0].length; coluna++) {
			total += n1[linha][coluna];
		}
	}
		total /= (n1.length * n1[0].length);
		return total;
	}
}
