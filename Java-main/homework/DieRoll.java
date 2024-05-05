package homework;

public class DieRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
int a;//die result of system
int b; //die result of user
 int Systemwin=0;
 int user=0;
 int tie=0;
int grand;
System.out.println();

for(i=1; i<=10; i++)
{
	a=1+  (int)(Math.random()*6);
	 b=1+ (int)(Math.random()*6);
	System.out.print("\nSystem die roll is " + a);
	System.out.print("\nUser die roll is " +b);
	int c=Math.max(a, b);
	if (a==b)
	{
		tie=tie+1; 
	}
	else if(c==a)
	{
		Systemwin=Systemwin+1; 
	}
	else if (c==b)
	{
		user=user+1;
	}

}

grand= Math.max(Systemwin,user);
System.out.print("\n Total system wins is :" + Systemwin + "\t Total user wins is :" +user + "\tTotal ties is :" + tie);
if (grand==Systemwin) {
	System.out.println("\nThe final winner is system");
}
else {
	System.out.println("\nThe final winner is user");
}
	}

}
