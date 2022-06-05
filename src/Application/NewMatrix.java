package Application;

import java.util.Locale;
import java.util.Scanner;

public class NewMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Please, type the number of columns:");
		int m = input.nextInt();
		System.out.println("Type the number of lines:");
		int n = input.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Type the number of line %d from column %d:%n", j, i);
				mat[i][j] = input.nextInt();
			}
		}
		
		System.out.println("What is the number to search?");
		int number_to_search = input.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == number_to_search) {
					System.out.printf("Position %d, %d:%n", i, j);

					if(j>0) {
						System.out.printf("Left: %d%n", mat[i][j-1]);
					}

					if(i>0) {
						System.out.printf("Up: %d%n,", mat[i-1][j]);
					}

					if(j < mat[i].length-1) {
						System.out.printf("Right: %d%n", mat[i][j+1]);
					}

					if(i < mat.length-1) {
						System.out.printf("Down: %d%n", mat[i+1][j]);
					}
				}
			}
		}

		input.close();
	}
}
