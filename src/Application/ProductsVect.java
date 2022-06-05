package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Products;

public class ProductsVect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do vetor:");
		int n = sc.nextInt();
		Products[] product = new Products[n];
		for(int i = 0; i < product.length; i++) {
			System.out.println("Digite o nome do produto:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Informe o preço do produto:");
			double price = sc.nextDouble();
			System.out.println("Agora, a quantidade desse produto:");
			int quantity = sc.nextInt();
			product[i] = new Products(name, price, quantity);
		}
		double sum = 0;
		for(int i = 0; i < product.length; i++) {
			sum += product[i].getPrice();
		}
		double avg = sum/product.length;
		System.out.printf("Average products price: %.2f", avg);
		sc.close();
	}

}
