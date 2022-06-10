package object_oriented_intro.triangle.entities;

public class BetterTriangle {

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a ) * (p - b) * (p - c));
	}
}
