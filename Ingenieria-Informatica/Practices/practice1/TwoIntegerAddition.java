package practice1;

import java.util.Scanner;

public class TwoIntegerAddition {
	public static void main(String[] args) {
		int num1, num2, guess;
		
		// Creates an Scanner object
		Scanner input = new Scanner(System.in);
		
		// Explains the code purpose and the action the user has to do
		System.out.print("This program generates two numbers between 0 and "
				+ "100, and you have to guess the sum of both\n\n");
		
		// Generates both random numbers
		num1 = (int)(Math.random() * 1000.0) % 100 + 1;
		num2 = (int)(Math.random() * 1000.0) % 100 + 1;
		
		// Shows both numbers and asks the user for the sum of them
		System.out.print("The numbers are " + num1 + " and " + num2 + "\n");
		System.out.print("What is the sum of them? ");
		guess = input.nextInt();
		
		if(guess == num1 + num2)
			System.out.print("\nYour answer is correct");
		else
			System.out.print("\nYour answer is incorrect");
	}
}
