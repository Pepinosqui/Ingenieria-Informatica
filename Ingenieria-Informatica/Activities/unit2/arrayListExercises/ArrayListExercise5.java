package unit2.arrayListExercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExercise5 {
	public static void main(String[] args) {
		// Creates the ArrayList to store the items as strings
		ArrayList<String> inventory = new ArrayList<>();
		
		// Stores the action to do in the do-while
		int option = 0;
		
		// Creates a Scanner object to read inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\nWelcome to your mini storage");
		
		do {
			System.out.println("\n\nType the number to do the specified action. "
					+ "Type a different number to exit the program");
			System.out.println(" 1.- Add a new product");
			System.out.println(" 2.- Delete a product");
			System.out.println(" 3.- Show all elements in order");
			System.out.println(" 4.- See how many products are");
			option =  Integer.parseInt(input.nextLine());
			
			switch(option) {
			case 1: // Adds a new string element
				System.out.println(" Enter the name of the new product:");
				inventory.add(input.nextLine());
				break;
			case 2: // Deletes a single element by giving its content
				System.out.println("Type the name of the item you want to delete "
						+ "exactly as it is. If the name given does not exist, "
						+ "nothing will be deleted");
				inventory.remove(input.nextLine());
				break;
			case 3: // Sorts all elements and prints them
				System.out.println("Currently, your inventory has:");
				Collections.sort(inventory);
				for(int itr = 1 ; itr <= inventory.size() ; itr++) {
					System.out.println(" " + itr + ". " + inventory.get(itr - 1));
				}
				break;
			case 4: // Shows the ArrayList size
				System.out.println(" At the moment you have " + inventory.size()
						+ " items stored");
				break;
			default:
			}
		} while(option >= 1 && option <= 4);
		
		// Ends the program and notifies the user. Also closes the Scanner object
		System.out.println("\n\nThe program has finished");
		input.close();
	}
}