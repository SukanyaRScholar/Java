package homework;
import java.util.Random;

public class RandomDeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is a program to generate random cards
		int totalCards=52;
		int card;
		int card1;
		card = 1 + (int)(51*Math.random());
		System.out.println("The card is :" + card);
		
	if (card % 13 == 0)
	{ 
		System.out.print(" Ace");
	}
		
	if (card % 13 == 10)
	{
		System.out.print("Jack");
	}
	if (card % 13 ==11)
	{
		System.out.print("Queem");
	}
	if (card % 13 ==12)
	{
		System.out.print("king");
	}
	
	if (card>0)
	{
		if (card<10)
			{ 
			card1 = card +1;
			System.out.print(" " + card);
			}
	}
	System.out.println(""+ card);
if (card / 13 ==0)
{
	System.out.print("clubs");

}
if (card /13 == 1)
	{ 
	System.out.print("Spade");


	}
if (card /13 ==2)
{
	System.out.print("Diamond");
}
if (card / 13 == 3)
{
	System.out.print("Hearts");
}

	}
	

}
