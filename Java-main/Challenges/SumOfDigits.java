package rehnuma;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to calculate the sum of digits
		
		Scanner input= new Scanner (System.in);
		System.out.print("Enter the three digit number: ");
		int number= input.nextInt();
		int digit1=number/100;
		int temp= number-(digit1*100);
		int digit2=temp/10;
		int digit3=temp-(digit2*10);
		int sum=digit1+digit2+digit3;
		
		System.out.print("Sum of the three digits is : " + sum);

	}

}
