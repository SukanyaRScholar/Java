package homework;
import java.util.Scanner;

public class AreaOfPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double s;
		System.out.print("Enter the number of sides : ");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		System.out.print("\nEnter the lengh of each side: ");
		s=input.nextDouble();
		System.out.println("\nThe area of the polygon is : " + areaofPolygon(n,s));

	}
	
	public static double areaofPolygon(int n, double s) {
		
		double areaofPolygon=(n*s*s)/(4* (Math.tan(Math.PI/n)));
	
	
         return (areaofPolygon);
}
}