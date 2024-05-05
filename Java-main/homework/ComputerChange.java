package homework;
// calculate the change

import java.util.Scanner;


public class ComputerChange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter the bill amount");
float billAmount= input.nextFloat();


int fivedollarbill;

fivedollarbill= (int)billAmount / 5;


System.out.print("Total fivedollar bills is  " +fivedollarbill);

double rem; 
rem = billAmount % 5;

int dollarbill;
dollarbill=(int)rem/1;

System.out.print("\nTotal dollarbill is " + dollarbill);

double rema;
int quarter;
rema=rem % 1;
double remb=rema/.25;
quarter=(int)remb;

System.out.print("\n total quarter " + quarter);

int dime;
double remc=rema%.25;
double remd=remc/.10;
dime=(int)remd;
System.out.print("\n total dime " +dime);

int nickel;
double reme=remc%.10;
double remf=reme/.05;
nickel=(int)remf;
System.out.print("\n total nickels " +nickel);

int penny;
double remg=reme%.05;
double remh=remg/.01;
penny=(int)remh;
System.out.print("\n total pennies " + penny);








	}

}
