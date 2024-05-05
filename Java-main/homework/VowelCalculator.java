package homework;
import java.util.*;

public class VowelCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.print("Enter a string: ");
String anyuserString=input.nextLine();
String userString=anyuserString.toLowerCase();
int count=0;
int index=0;
while(index<=userString.length()-1)
	{
	if (userString.charAt(index)=='a'|| userString.charAt(index)=='e' || userString.charAt(index)=='i' || userString.charAt(index)=='0' || userString.charAt(index)=='u')
			{
		count=count+1;
			}
	index++;
	}
System.out.print(count);
	}
}

