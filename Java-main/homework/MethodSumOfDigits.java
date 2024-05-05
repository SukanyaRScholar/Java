package homework;
import java.util.*;

public class MethodSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		number=input.nextInt();
	
		System.out.println("The sum of digits is: " + sumOfDigits(number));

	}
	
	public static int sumOfDigits(int number) {
		
		int rem;
		int sumOfDigits=0;
		
	
		while((number/10)>0 && (number%10)>=0)
		{
			rem=number%10;
			sumOfDigits=sumOfDigits +rem;
			number=number/10;		
		}
		sumOfDigits=sumOfDigits+number;
		return(sumOfDigits);
	}


}
