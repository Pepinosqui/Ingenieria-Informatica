package Unit2;

import java.util.Scanner;

public class rollDice {
	
	public static void main(String[] args) {
		int valord;
		Scanner input;
		
		input = new Scanner(System.in);
		System.out.println("Ingresar suma deseada");
		valord = input.nextInt();
		
		System.out.println("Tiras un total de " + rollDice(valord) + " veces");
	}
	
	public static int rollDice(int sumad) {
		int dice1, dice2;
		int i = 0;
		
		if(sumad >= 2 && sumad <= 12) {
			do {
				dice1 = (int)(Math.random() * 100 % 6 + 1);
				dice2 = (int)(Math.random() * 100 % 6 + 1);
				
				++i;
				
				System.out.println("Los resultados del tiro fueron: dado 1 = " + dice1
						+ ", dado 2 = " + dice2);
				System.out.println("El numero de veces fue: " + i);
			} while(dice1 + dice2 != sumad);
		}
		
		return i;
	}
}