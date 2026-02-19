package Unit2.ArrayList_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise3 {
	public static void main(String[] args) {
		// Creates a list of strings
		ArrayList<String> students = new ArrayList<>();
		
		// Stores the action to do
		int option;
		
		// Creates a Scanner object to use
		Scanner input = new Scanner(System.in);
		
		do {
			// Asks the user for the action to do
			System.out.println("\nType the number to perform the indicated action. "
					+ "Enter a different number or letter to end the program");
			System.out.println(" 1. Add three new names");
			System.out.println(" 2. Show all students");
			System.out.println(" 3. Delete a student");
			System.out.println(" 4. Verify if a student is registered");
			option =  Integer.parseInt(input.nextLine());
			
			switch(option) {
			case 1: // Adds three new names
				for(int itr = 0 ; itr < 3 ; itr++) {
					System.out.println("\nType the name number " + itr + " of 3");
					students.add(input.nextLine());
				}
				break;
			case 2: // Shows all list elements
				System.out.println("\nCurrently there are the following students:");
				for(int itr = 0 ; itr < students.size() ; itr++) {
					System.out.println(" " + itr + ".- " + students.get(itr));
				}
				break;
			case 3: // Removes a single element
				System.out.println("\nType the student to delete");
				students.remove(input.nextLine());
				break;
			case 4: // Checks if an element already exists
				System.out.println("\nType the number to check if already exists");
				if(students.contains(input.nextLine()))
					System.out.println(" This name already exists");
				else
					System.out.println(" This name does not exists");
				break;
			default:
			}
		} while(option >= 1 && option <= 4);
		
		System.out.println("\n\nProgram finished");
		
		// Closes the Scanner object once it is not needed anymore
		input.close();
	}
}
