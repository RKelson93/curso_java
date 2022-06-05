package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Rectangle;

public class CalcRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rt = new Rectangle();
		System.out.println("Por favor, digite abase do retângulo:");
		rt.base = sc.nextDouble();
		System.out.println("Por favor, digite a altura do retângulo:");
		rt.height = sc.nextDouble();
		System.out.println(rt);
		sc.close();
	}

}
