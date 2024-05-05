import java.util.*;
public class ClassWorkJan31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner input=new Scanner(System.in);
int n=input.nextInt();

for(i=0; i<5; i++)
{
	n=n+i;
	if(n>7)
	{
		break;
	}
	System.out.println(i + "" + n);		
}
	}

}
