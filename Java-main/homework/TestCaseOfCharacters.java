package homework;

import java.util.Scanner;


public class TestCaseOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.print("Enter the character");


char value = input.nextLine().charAt(0);

if(value >= 'A' && value <= 'Z') {
	System.out.println("Value" + value + " is upper case");
}
if (value >='a' && value <='z') {
	System.out.println("Value" + value + "is lower case");
}
if (value >= '0' && value <='9') {
	System.out.println("Value is " + value + " is number");
}
	}

}
