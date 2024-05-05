package homework;

public class RockPaperScissorHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int userChoice;
		int computerChoice;
		int tie=0;
		int win=0;
		int lose=0;
		
		for(i=1; i<=1000; i++)
{
	 computerChoice= 1+ (int)(Math.random()*3);
	if (i>=1 && i<=300)
		{
			userChoice=1;
			if(userChoice==1 && computerChoice==1)
			{
				tie= tie+1;
			}
				else if (userChoice==1 && computerChoice==2)
			{
				win=win+1;
			}
					else {
				lose=lose+1;
			}
		}
	else if (i>300 && i<=600 )
		{
			userChoice=2;
			if(userChoice==2 && computerChoice==2)
			{
				tie= tie+1;
			}
				else if (userChoice==2 && computerChoice==3)
			{
				win=win+1;
			}
					else {
				lose=lose+1;
			}
		}
		
	else if(i>600 && i<=1000)
		{
			userChoice=3; 
			if(userChoice==3 && computerChoice==3)
			{
				tie= tie+1;
			}
				else if (userChoice==3 && computerChoice==1)
			{
				win=win+1;
			}
					else {
				lose=lose+1;
			}
		}
		
	
 }
int TotalAmount= (win*2) + (tie*1) + (lose*0);
System.out.print("Total win:  "+win+"\nTotal lose: "+lose+" \nTotal tie:  "+tie);
System.out.print("\nTotal amount won is :$" + TotalAmount);
  }
		
 }

	




