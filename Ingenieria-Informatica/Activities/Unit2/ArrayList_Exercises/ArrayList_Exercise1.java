package Unit2.ArrayList_Exercises;

import java.util.ArrayList;

public class ArrayList_Exercise1 {
	public static void main(String[] args) {
		// Creating of an ArrayList of strings
		ArrayList<String> fruits = new ArrayList<>();
		
		// Addition of six different fruit strings to the list
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Grape");
		fruits.add("Banana");
		fruits.add("Melon");
		fruits.add("Peach");
		
		// Print of the list's size
		System.out.print(" There are a total of " + fruits.size()
				+ " elements in the list\n");
		
		// Print of all elements using for
		System.out.println("\n Printing all elemets using for:\n");
		for(int itr = 0 ; itr < fruits.size() ; itr++)
			System.out.println(fruits.get(itr));
		
		// Print of all elements using for-each
		System.out.println("\n Printing all elemets using for-each:\n");
		for(String itr : fruits)
			System.out.println(itr);
	}
}
