package practice1;

import java.util.Scanner;

public class ThreeIntegerAddition {
	public static void main(String[] args) {
		int num1, num2, num3, guess;
		
		// Creates an Scanner object
		Scanner input = new Scanner(System.in);
		
		// Explains the code purpose and the action the user has to do
		System.out.print("This program generates three single-digit numbers and "
				+ "you have to type the sum of them\n\n");
		
		// Generates both random numbers
		num1 = (int)(Math.random() * 1000.0) % 9 + 1;
		num2 = (int)(Math.random() * 1000.0) % 9 + 1;
		num3 = (int)(Math.random() * 1000.0) % 9 + 1;
		
		// Shows both numbers and asks the user for the sum of them
		System.out.print("The numbers are " + num1 + ", " + num2 + " and " + num3 + "\n");
		System.out.print("What is the sum of them? ");
		guess = input.nextInt();
		
		if(guess == num1 + num2 + num3)
			System.out.print("\nYour answer is correct");
		else
			System.out.print("\nYour answer is incorrect");
		
		// Closes the Scanner object
		input.close();
	}
}