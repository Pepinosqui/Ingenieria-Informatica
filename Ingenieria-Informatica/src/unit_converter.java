import java.util.Scanner;

public class unit_converter {
	
	public static void main(String[] args) {
		// Constant values
		double CENTIMETERS_PER_INCH = 2.54;
		int INCHES_PER_FOOT = 12;
				
		// Variables
		int		feet;
		int		inches;
		int		totalInches;
		double	centimeters;
		
		// Data input
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Ingresa la cantidad de pies: ");
		feet = userInput.nextInt();
		System.out.println("Ingresa la antidad de pulgadas: ");
		inches = userInput.nextInt();
		
		// Inches and centimeters conversion
		totalInches = INCHES_PER_FOOT * feet + inches;
		centimeters = CENTIMETERS_PER_INCH * totalInches;
		
		// Data output
		System.out.println("\n Una distancia de " + feet + "\' " + inches + "\" "
			+ "tiene un total de " + totalInches + " pulgadas, que equivale a "
			+ centimeters + " centímetros");
	}
	
}
