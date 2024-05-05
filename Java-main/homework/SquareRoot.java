package homework;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double n;
Scanner input=new Scanner(System.in);
System.out.print("Find the square root of: ");
n=input.nextInt();
System.out.println("The squareroot value is : " + squareRoot(n));
	}

	
	public static double squareRoot(double n) {
		double lastguess=1.0;
		double nextguess=lastguess+1;
		double squareRoot=0;
		for (lastguess=1;lastguess<n ; lastguess++)
		{
		nextguess=((lastguess+(n/lastguess))/2);
		if(lastguess==nextguess || (Math.abs(lastguess-nextguess)<=0.000001))
		{
			squareRoot=nextguess;
		}
	}
		return squareRoot;
}
}