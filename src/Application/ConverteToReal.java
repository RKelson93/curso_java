package Application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class ConverteToReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				double dolarPrice;
		double amount;
		System.out.println("What's the dolar price?");
		dolarPrice = sc.nextDouble();
		System.out.println("What's the dolar amount to converte?");
		amount = sc.nextDouble();
		System.out.printf("Dolar price in real: %.2f%n Dolar amount to convert: %.2f%n Total real converted: %.2f%n", dolarPrice, amount, CurrencyConverter.calc(dolarPrice, amount));
		sc.close();
	}

}
