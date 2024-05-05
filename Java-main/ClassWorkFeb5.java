import java.util.*;
public class ClassWorkFeb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the value ");
Scanner input=new Scanner(System.in);
int value=input.nextInt();
int i,j;

for(i=1; i<=value; i++)
{
	for(j=1; j<=i; j++)
	{
		System.out.print("*");
	}
	System.out.println("");
}
	
	}

}
