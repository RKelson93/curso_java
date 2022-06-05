package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Products;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Products product = new Products();
		int quantity;
		System.out.println("Enter the product data:");
		System.out.print("Name:");
		product.name = sc.nextLine();
		System.out.print("Price:");
		product.price = sc.nextDouble();
		System.out.print("Quantity:");
		product.quantity = sc.nextInt();
		System.out.println(product);
		System.out.println("Type the quantity of products to add");
		quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.println(product);
		System.out.println("Type the quantity of remove products:");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		System.out.println(product);
		sc.close();
	}

}
