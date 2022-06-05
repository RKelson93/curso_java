package Application;

import java.util.Locale;
import java.util.Scanner;

public class AverageHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanho do vetor:");
		int n = sc.nextInt();
		double[] height = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Digite a " + (i+1) + "ª altura:");
			height[i] = sc.nextDouble();
		}
		double soma = 0;
		for(int i = 0; i < n; i++) {
			soma += height[i];
		}
		double media = soma/n;
		System.out.println();
		System.out.println("Média das alturas: " + String.format("%.2f", media));
		sc.close();
	}

}
