package Unit2.ArrayList_Exercises;

import java.util.ArrayList;

public class ArrayList_Exercise2 {
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
		
		// Answer of the questions
	}
}
