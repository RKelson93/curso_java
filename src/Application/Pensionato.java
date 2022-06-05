package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[10];
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Aluguel #" +i+":");
			System.out.println();
			System.out.println("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Número do quarto:");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email);
		}
		System.out.println("Quartos ocupados:");
		for(int i = 0; i < 10; i++) {
			if(rent[i] != null) {
				System.out.println("Quarto #" +i+": " +rent[i]);
			}
		}
		sc.close();
	}

}
