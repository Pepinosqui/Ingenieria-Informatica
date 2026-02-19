package classesIntroduction;

public class Circle {
	double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double assignRadius) {
		radius = assignRadius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}
}
