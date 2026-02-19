package classesIntroduction;

public class ClassesIntroductionMain {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4.0 , 40.0);
		Rectangle rec2 = new Rectangle(3.5 , 35.9);
		
		System.out.println("The first rectangle has:");
		System.out.println(" Width = " + rec1.width);
		System.out.println(" Heigth = " + rec1.heigth);
		System.out.println(" Area = " + rec1.getArea());
		System.out.println(" Perimeter = " + rec1.getPerimeter());
		
		System.out.println("\nThe second rectangle has:");
		System.out.println(" Width = " + rec2.width);
		System.out.println(" Heigth = " + rec2.heigth);
		System.out.println(" Area = " + rec2.getArea());
		System.out.println(" Perimeter = " + rec2.getPerimeter());
	}
}
