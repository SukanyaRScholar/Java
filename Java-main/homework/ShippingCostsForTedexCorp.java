package homework;
//program to compute the shipping costs of packages based on weight of the package
/* sample console
 
Enter your name: Marcelo

Enter the weight of the package: 12.4

Marcelo, the total cost for your package is 5.75.   */

import java.util.Scanner;

public class ShippingCostsForTedexCorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input=new Scanner(System.in);
System.out.print("Enter your name: ");//to prompt user to enter user name
String name=input.nextLine(); //reads customer name input
System.out.print("\nEnter the weight of the package: ");//to prompt user to enter weight of the package
double weight= input.nextDouble();//reads weight input
System.out.println();
 
if ((weight>0) && (weight<=10))
 {
	 System.out.println( name+", the total cost for your package is 2.50." );
 }
else if ((weight>10)&& (weight<=20)) 
 {
	System.out.println(name +", the total cost for your package is 5.75. " );
 }
else if ((weight>20) && (weight<=30))
 {
	 System.out.println(name +", the total cost for your package is 8.15. " );
 }
else
 {
	 System.out.println(name + ", the package cannot be shipped.");
 }
	}

}
