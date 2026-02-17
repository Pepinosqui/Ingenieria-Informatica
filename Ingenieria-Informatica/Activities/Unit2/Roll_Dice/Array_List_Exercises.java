package Unit2.Roll_Dice;

public class Array_List_Exercises {
	public static void main(String[] args) {
		int[][] matrix = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15}};
		
		for(int[] u:matrix) {
			for(int elem:u)
				System.out.print(elem + "\t");
			System.out.print("\n");
		}
		System.out.println();
		for(int i=0 , j=0 ; i<matrix.length && j<matrix[i].length ; i++,j++)
			System.out.print(matrix[i][j] + "\t");
	}
}
