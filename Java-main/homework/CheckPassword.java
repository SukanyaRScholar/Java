package homework;
import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the password: ");
		p=input.nextLine();
		System.out.println("\nThe password is valid? \n In terms of lenght      " + Atleast8(p)+ "\n Only letters and digits " + LetterorDigit(p)+ "\n Has atleast 2 digits    "  + Atleast2Digits(p));
		
	
	}

	public static boolean Atleast8(String p) {
		boolean valid;
		if (p.length()>=8)
		{
			valid=true;
		}
		else 
		{
			valid=false;
			}
		return valid;
	
}

	
	public static boolean LetterorDigit(String p) {
		boolean value=true;
		int i;
		int count=0;
		int m;
		for(i=0; i<p.length();i++)
		
		{
			m=p.charAt(i);
			if ((Character.isLetter(m)==true)|| (Character.isDigit(m)==true))
			{
				value=true;
			}
			else 
				{
				value=false;
				count=count+1;
				}
			if (count>0)
			{
				value=false;
			}
		}
		return value;
			
	
	}
	
	public static boolean Atleast2Digits(String p) {
		int m;
		int count=0;
		int i;
		boolean valid;
		for(i=0; i<p.length(); i++)
		{
			m=p.charAt(i);
			if (Character.isDigit(m)==true)
			{
				count=count+1;
			}
			
		}
		if (count>=2)
		{
			valid=true;
		}
		else
		{
			valid=false;
		}
	
	return valid;
	}
}

	
