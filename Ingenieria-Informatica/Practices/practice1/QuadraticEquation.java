package practice1;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// Declares the variables for the three coefficients
		//  and the discriminant of the equation
		double a, b, c, discriminant;
		
		Scanner input = new Scanner(System.in);
		
		// Explains the purpose of the code and asks for the values
		System.out.println("This program solves a quadratic equation.");
		System.out.println(" Type the value of the quadratic term");
		a = input.nextDouble();
		// If a is equal to zero, the formula cannot be used, so it
		//  asks for a value of a until it is different from zero
		while(a == 0.0) {
			System.out.println(" This value cannot be equal to zero. Type it again");
			a = input.nextDouble();
		}
		
		System.out.println(" Type the value of the linear term");
		b = input.nextDouble();
		
		System.out.println(" Type the value of the independent term");
		c = input.nextDouble();
		
		// Computes the discriminant based on the values of a, b and c
		discriminant = b * b - 4.0 * a * c;
		
		if(discriminant < 0.0) {
			System.out.println("\nThe roots are:");
			System.out.println("  r1 = " + (-b / (2.0 * a)) + " + " +
					(Math.pow(-discriminant , 0.5) / (2.0 * a)) + "i");
			System.out.println("  r1 = " + (-b / (2.0 * a)) + " - " +
					(Math.pow(-discriminant , 0.5) / (2.0 * a)) + "i");
		}
		else if(discriminant == 0.0) {
			System.out.println("\n The root is:");
			System.out.println("  r = " + -b / (2.0 * a));
		}
		else { // Applies for discriminant > 0.0
			System.out.println("\nThe roots are:");
			System.out.println("  r1 = " + ((-b + Math.pow(discriminant, 0.5)) / (2.0 * a)));
			System.out.println("  r2 = " + ((-b - Math.pow(discriminant, 0.5)) / (2.0 * a)));
		}
	}
}
