package homework;
//to find the area of the pentagon

import java.util.Scanner;


public class AreaOfPentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		 System.out.println("enter the distance: ");
		 double distanceFromCentre = input.nextDouble();
		 //this is the vlaue of r
		 
		 double side = 2 * distanceFromCentre * Math.sin((Math.PI)/5);
		 double area= (5 * Math.pow(side,2))/(4* Math.tan((Math.PI/5)));
		 
		 System.out.println("The are of the pentagon is: " + area);

	}

}
