package classesIntroduction;

public class ClassesIntroductionMain {
	public static void main(String[] args) {
		Circle circ1 = new Circle();
		System.out.println(circ1.getArea());
		circ1.printDateCreated();
		Circle.printNCircles();
		
		System.out.println(circ1.dateCreated.getTimeInMillis());
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println("NEIN");
		}
		
		Circle circ2 = new Circle(14.6);
		System.out.println(circ2.getArea());
		circ1.printDateCreated();
		Circle.printNCircles();
		
		System.out.println(circ2.dateCreated.getTimeInMillis());
	}
}
