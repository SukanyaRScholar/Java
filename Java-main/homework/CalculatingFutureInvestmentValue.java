package homework;//this is a program from the package and project homework//
//Assignment-1 by Sukanya from ITSS 1311.003

/*The following is the output with the investment amount 2018.50
  annual rate 4.5% and period of 3 years */
/* 
Enter investment amount: 2018.50
Enter annual interest rate in percentage: 4.5
Enter the number of years:  3
The value of $2018.5 after 3 years is: $2309.66424930557
 */

import java.util.Scanner; // the scanner class is in java.util.package. 

/*importing class will be written above the public class */

public class CalculatingFutureInvestmentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int years; //number of years as integers
		double numberofMonths; 
		//number of months declared as double due to possible entry of decimal values
		double futurInvestmentvalue;
		//the future investment value will be more accurate if expressed as double
		
		System.out.print("Enter investment amount: ");
		//prints user prompts to enter investment amount
		double investmentAmount = input.nextDouble();
		// gets the input from the user
		
		System.out.print("Enter annual interest rate in percentage: ");
		// prompts user to enter interest rate
		double annualInterestrate = input.nextDouble();
		
		System.out.print("Enter the number of years: ");
		//prompts user to enter the number of years
		years = input.nextInt();
		
		
		numberofMonths = years * 12;
		//to convert entered years to months
		
		double monthlyInterestrate = annualInterestrate / 1200;
		//monthly interest rate = (annual interest rate/100)/12 = annual interest rate /1200
		
		futurInvestmentvalue = investmentAmount * Math.pow((1 + monthlyInterestrate),numberofMonths);
		//Math.pow(a,b)=a^b  a is the base and b is the power. 
		/* future value = investment amount * (1+monthly rate)^months */
		
		System.out.print("The value of $" + investmentAmount + " after " + years + " years is: $" + futurInvestmentvalue);
		//This prints the initial value after the no. of years as accurate future value
		
		
		
		

	}

}
