import java.util.Scanner;

public class Guess_a_Number {
	public static void main(String[] args) {
		// Variables
		int randomNumber, guessedNumber, repeatNumber;
		
		// Algorithm start
		System.out.println("This program generates randomly a number between "
				+ "0 and 100 (these two values are not used), and you have to "
				+ "guess it.\nTo do so, type a single number between this same "
				+ "range, and you will know if you are correct, or your number "
				+ "is greater\nor less than the original, asking you for a new "
				+ "number to guess until you are correct.\n");
		
		do {
			randomNumber = (int)(Math.random() * 100.0 % 99 + 1);
			
			Scanner userInput = new Scanner(System.in);
			
			do {
				System.out.println("Type your guess between 0 and 100.");
				guessedNumber = userInput.nextInt();
				
				if(guessedNumber == randomNumber)
					System.out.println("\nYour guess is correct.");
				else if(guessedNumber <= randomNumber)
					System.out.println("\nYour guess is lower than the number. Try again.");
				else if(guessedNumber >= randomNumber)
					System.out.println("\nYour guess is greater than the number. Try again.");
				
			} while(guessedNumber != randomNumber);
			
			System.out.println("Do you want to repeat the program? Type 0 for no, "
					+ "every other number for yes");
			repeatNumber = userInput.nextInt();
		} while(repeatNumber != 0);
	}
}
