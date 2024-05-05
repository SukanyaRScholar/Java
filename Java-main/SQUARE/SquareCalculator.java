package SQUARE;
import java.util.*;

public class SquareCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square aSquare=new Square();
double insideLength=0;
Scanner input=new Scanner(System.in);

System.out.println("Enter the side lenght");
insideLength=input.nextDouble();
while (insideLength<0)
{
	System.out.println("Length cannot be negative");
	System.out.println("Enter length again: ");
	insideLength=input.nextDouble();
}
input.nextLine();

aSquare.setlength(insideLength);

double perimeter=perimeter(insideLength);
	}

	public static double perimeter(int side) {
		double perimeterValue;
		return perimeterValue=4 * side;
	}
}
