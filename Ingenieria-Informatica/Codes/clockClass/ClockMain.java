package clockClass;

public class ClockMain {
	public static void main(String[] args) {
		Clock clock1 = new Clock();
		Clock clock2 = new Clock(9, 1, 30);
		
		System.out.print("First time: ");
		clock1.printTime();
		System.out.print("\nSecond time: ");
		clock2.printTime();
	}
}
