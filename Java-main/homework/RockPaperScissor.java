package homework;

/*
 Output:
Total Wins:  323
Total Lose:  337 
Total Ties:  340

Total reward won in 1000 games against the computer is $986
 */

public class RockPaperScissor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int userChoice;
		int computerChoice;
		int tie=0;
		int win=0;
		int lose=0;
		final int rock=1, scissor=2, paper=3;
   for(i=1; i<=1000; i++)//game played 1000 times, so 1000 iterations
   {
	 computerChoice= 1+ (int)(Math.random()*3);
	 //1 - Rock ; 2 - Scissor; 3 - Paper
	 //rock crushes scissor, scissor cuts paper, and paper wraps rock
	 
	if (i>=1 && i<=300) // userChoice is rock from iteration 1 t0 300
		{
			userChoice=rock;
			if(userChoice==rock && computerChoice==rock)
			{
				tie= tie+1;
			}
			else if (userChoice==rock && computerChoice==scissor)
			{
				win=win+1;
			}
			else {
				lose=lose+1;
			}
		}
	else if (i>300 && i<=600 )//userChoice is scissor from iteration 301-600
		{
			userChoice=scissor;
			if(userChoice==scissor && computerChoice==scissor)
			{
				tie= tie+1;
			}
			else if (userChoice==scissor && computerChoice==paper)
			{
				win=win+1;
			}
			else {
				lose=lose+1;
			}
		}
		
	else //userChoice is paper from iteration 601-1000
		{
			userChoice=paper; 
			if(userChoice==paper && computerChoice==paper)
			{
				tie= tie+1;
			}
			else if (userChoice==paper && computerChoice==rock)
			{
				win=win+1;
			}
			else {
				lose=lose+1;
			}
		}
		
	
   }
int TotalAmount= (win*2) + (tie*1) + (lose*0);//reward: win=$2, tie=$1 and lose=$0
System.out.println("Total Wins:  "+win+"\nTotal Lose:  "+lose+" \nTotal Ties:  "+tie);
System.out.println("\nTotal reward won in 1000 games against the computer is $" + TotalAmount);
  }
		
 }

	






	
	
		