package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.TriangleData;

public class CalcTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TriangleData x, y;
		x = new TriangleData();
		y = new TriangleData();
		Locale.setDefault(Locale.US);
		System.out.println("Please, enter the measure of triangle X:");
		x.lado_a = sc.nextDouble();
		x.lado_b = sc.nextDouble();
		x.lado_c = sc.nextDouble();
		System.out.println("Please, enter the measure of triangle Y:");
		y.lado_a = sc.nextDouble();
		y.lado_b = sc.nextDouble();
		y.lado_c = sc.nextDouble();
		System.out.printf("The area of triangle X is %.4f.%nThe area of triangle Y is %.4f%n.", x.triangleAreaCalculator(), y.triangleAreaCalculator());
		if(x.triangleAreaCalculator() > y.triangleAreaCalculator()) {
			System.out.printf("The greater area is %.4f.%n", x.triangleAreaCalculator());
		}
		else if(x.triangleAreaCalculator() == y.triangleAreaCalculator()) {
			System.out.println("The two areas are equals.");
		}
		else {
			System.out.printf("The areaY is greater: %.4f.%n", y.triangleAreaCalculator());
		}
	}

}
