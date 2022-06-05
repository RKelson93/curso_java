package Application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int negativeNumbers = 0;
		System.out.println("Type the matriz size:");
		int n = input.nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Type the number of line %d, column %d:%n", i, j);
				mat[i][j] = input.nextInt();
			}
		}
		System.out.println();
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length; i++)
			System.out.printf("%d%n", mat[i][i]);

		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0)
					negativeNumbers += 1;
			}
		}

		System.out.printf("Negative numbers: %d.,", negativeNumbers);
	}
}
