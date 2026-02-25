package practice1;

import java.util.Scanner;

public class TwoRectangles {
	public static void main(String[] args) {
		// Declares the variables for the rectangles as arrays
		double[] xCenter = new double[2];
		double[] yCenter = new double[2];
		double[] heigth = new double[2];
		double[] width = new double[2];
		
		// Creates a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Explains the user the purpose of the program
		System.out.print("This program asks for two rectangles, "
				+ "drawing them with their center, width and heigth.\n");
		System.out.print("Then, determines whether the second rectangle is "
				+ "inside or overlaps the first one\n");
		
		// Asks the user for all parameters
		for(int i = 0 ; i < 2 ; ++i) {
			System.out.println("\nType the center's x coordinate for the rectangle " + (i + 1));
			xCenter[i] = input.nextDouble();
			
			System.out.println("Type the center's y coordinate for the rectangle " + (i + 1));
			yCenter[i] = input.nextDouble();
			
			System.out.println("Type the heigth for the rectangle " + (i + 1));
			heigth[i] = input.nextDouble();
			
			System.out.println("Type the width for the angle " + (i + 1));
			width[i] = input.nextDouble();
		}
		
		if(xCenter[1] > xCenter[0] - width[0] / 2.0 &&
				xCenter[1] < xCenter[0] + width[0] / 2.0 &&
				yCenter[1] > yCenter[0] - heigth[0] / 2.0 &&
				yCenter[1] < yCenter[0] + heigth[0] / 2.0) {
			System.out.println("\nThe second rectangle is inside the first one");
		}
		else if((xCenter[1] - width[1] / 2.0 <= xCenter[0] + width[0] / 2.0 ||
				xCenter[1] + width[1] / 2.0 >= xCenter[0] - width[0] / 2.0) &&
				(yCenter[1] - heigth[1] / 2.0 <= yCenter[0] + heigth[0] / 2.0 ||
				yCenter[1] + heigth[1] / 2.0 >= yCenter[0] - heigth[0] / 2.0)) {
			System.out.println("\nThe second rectangle overlaps the first one");
		}
		else
			System.out.println("\nThe second rectangle does not touch the first one");
		
		
		// Closes the Scanner object
		input.close();
	}
}
