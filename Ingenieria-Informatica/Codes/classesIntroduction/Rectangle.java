package classesIntroduction;

public class Rectangle {
	// Data fields
	double width;
	double heigth;
	
	// Constructors
	public Rectangle() {
		width = heigth = 1.0;
	}
	
	public Rectangle(double inputWidth, double inputHeigth) {
		width = inputWidth;
		heigth = inputHeigth;
	}
	
	// Methods
	public double getArea() {
		return width * heigth;
	}
	
	public double getPerimeter() {
		return 2.0 * width + 2.0 * heigth;
	}
}
