package Entities;

public class Rectangle {
public double height;
public double base;
public double area;
public double perimeter;
public double diagonal;

public double getArea() {
	return base*height;
}

public double getPerimeter() {
	return (base*2) + (height*2);
}

public double getDiagonal() {
	return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
}

public String toString() {
	return "Area:"
			+ " "
			+ getArea()
			+ ", "
			+ "perimetro: "
			+ getPerimeter()
			+ ", "
			+ "diagonal: "
			+ getDiagonal();
}
}
