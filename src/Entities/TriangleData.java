package Entities;

public class TriangleData {
// Data of triangles
	public double lado_a;
	public double lado_b;
	public double lado_c;
	
	public double triangleAreaCalculator() {
		double p = (lado_a + lado_b + lado_c)/2.0;
		return Math.sqrt(p * (p - lado_a) * (p - lado_b) * (p - lado_c));
	}
}
