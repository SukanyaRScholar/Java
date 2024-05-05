package homework;
import java.util.Scanner;
public class CarYearFacility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int carYear;
		Scanner input= new Scanner(System.in);
		System.out.println(Math.rint(-2.1));
		System.out.println("Enter the make year: ");
		carYear= input.nextInt();
		
		if (carYear<1968)
		{ 
			System.out.println("Probably has few safety features.");
	
		}
		if (carYear>1971)
		{
			System.out.println("Probably has head rests.");
		}
		if (carYear>1991)
		{
			System.out.println("Probably has alnti-lock brakes.");
		}
		if(carYear>2001)
		{
			System.out.println("Probably has tire-pressure monitor.");
		}
		
	}

}
