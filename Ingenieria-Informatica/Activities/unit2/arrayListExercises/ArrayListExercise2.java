package unit2.arrayListExercises;

import java.util.ArrayList;

public class ArrayListExercise2 {
	public static void main(String[] args) {
		// Creation of an ArrayList of integers
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Addition of the numbers from 1 to 10
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		// Replacement of the element with index 4 for a value of 100
		numbers.set(4, 100);
		
		// Deletion of the number with index 2
		numbers.remove(2);
		
		// Print of the final list
		System.out.print(" The final list is:\n");
		for(int element : numbers)
			System.out.println(element);
		
		// Answering the questions
		System.out.println("\nThe following are the questions");
		
		System.out.println("\nWhat happens to the indexes "
				+ "after removing an element?");
		System.out.println(" The indexes of the following elements move "
				+ "one place, filling the gap left by the removed element");
		
		System.out.println("\nHow does the ArrayList size changes?");
		System.out.println(" It increments by one after adding an element, "
				+ "and decreases in one after removing an element");
	}
}