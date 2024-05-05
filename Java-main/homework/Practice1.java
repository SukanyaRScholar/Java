package homework;

import java.util.Scanner;

//program to get input from user

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter integer");
		int value=keyboard.nextInt();
		System.out.print("\nNumber entered:"+value);
		System.out.print("\nsquare:" + value*value);
		System.out.print("\nsquare" + Math.pow(value, 2));
		System.out.print("\nRounded square value:" + (int)Math.pow(value, 2));
		System.out.print("\naddition to its own:" +(value+value));
		keyboard.close();
	}
	}


