package unit2.arrayListExercises;

import java.util.ArrayList;

public class ArrayListExercise4 {
	// The following main code was copied from GitHub
	// If a correction was made, a comment shows the original code and
	//  explains why it was wrong
	public static void main(String[] args) {

        // Original code: ArrayList lists = new ArrayList<String>();
		// The type of the elements has to be specified within
		//  the first <>, not in the last pair
		// The correction is in the following line
		ArrayList<String> lista = new ArrayList<>();
		
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        // Original: System.out.println("Elemento en posición 3: " + lista.get(3));
        // The elements start with an index of 0, not 1. So, if you want the
        //  third element, you need the element with at index of 2, not 3
        // The correction is in the following line
        System.out.println("Elemento en posición 3: " + lista.get(2));
        
        // Original: for (int i = 0; i <= lista.size(); i++)
        // Getting the element equal to the length of the list is not possible
        //  as it tries to access to an inexistent element, just one place above
        //  the last element
        // The correction is in the following line
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        // Although not incorrect at all, this does not remove anythings as there are
        //  no elements equal to "Cuatro". This line can be either removed or changed
        //  for "Uno", "Dos" or "Tres", resulting in the one typed being deleted
        lista.remove("Cuatro");
        
        // Original: System.out.println("Tamaño final: " + lista.length());
        // The length method is not defined for an ArrayList of Strings,
        //  having to use the size method instead
        // The correction is in the following line
        System.out.println("Tamaño final: " + lista.size());
    }
}