package practice1;

import java.util.Scanner;

public class Cramer {
	public static void main(String[] args) {
		// Declares the variables for the coefficients and results
		double A, B, C, D, E, F, determinant;
		
		// Creates an Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Explains the code's purpose
		System.out.print("This program solves a 2x2 linear equation system of the form:\n");
		System.out.print("\tAx + By = E\n");
		System.out.print("\tCx + Dy = F\n\n");
		
		// Asks the user for the equation
		System.out.print("Type the value of the coefficient A: ");
		A = input.nextDouble();
		System.out.print("Type the value of the coefficient B: ");
		B = input.nextDouble();
		System.out.print("Type the value of the coefficient E: ");
		E = input.nextDouble();
		System.out.print("Type the value of the coefficient C: ");
		C = input.nextDouble();
		System.out.print("Type the value of the coefficient D: ");
		D = input.nextDouble();
		System.out.print("Type the value of the coefficient F: ");
		F = input.nextDouble();
		
		// Computes the determinant of the coefficients 2x2 matrix
		// If this value is zero, the solution does not exist
		determinant = A * D - B * C;
		
		if(determinant == 0) {
			System.out.print("\n\nThis equation system has no solution");
		}
		else {
			System.out.print("\n\nThe solution of the equation system is:");
			System.out.print("\n x = " + ((E * D - B * F) / determinant));
			System.out.print("\n y = " + ((A * F - E * C) / determinant));
		}
		
		// Closes the Scanner object
		input.close();
	}
}
