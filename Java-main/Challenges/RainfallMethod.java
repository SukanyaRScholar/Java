package rehnuma;
import java.util.*;

public class RainfallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int months;
double[] thisyear= new double[12];
Scanner input=new Scanner(System.in);
for (months=0; months<12; months++)
{
	thisyear[months]=input.nextDouble();
}

	}
	
public static void mAverage(double num1, double num2){
	int sum=0;
	sum++;
	for (int i = num1; i <= num2; i++)
	{ 
		sum += i;
	}*/

	int n;
	int i=0;
	double sum=0;
	double m;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number: ");
	n=input.nextInt();
	
	System.out.println("Average is : "+ rainAverage(n));		
	
}

	public static double rainAverage(int n) {
		
		double rainAverage;
		int i=0;
		double m;
		double sum=0;
		Scanner input=new Scanner(System.in);
		while(i<n)
		{
			m=input.nextDouble();
			sum=sum+m;
			i++;
		}
		rainAverage= sum/n;
		return(rainAverage); 
		
	}

}
