package demo;
import java.util.*;

public class PracticeForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String name1="Sukanya";
		String name2="Bharanee";
		System.out.println(name1.length());
		System.out.println(name1.toUpperCase());
		System.out.println(name1.charAt(4));
		System.out.println(name1.concat(name2));
		System.out.println((name1.concat (" ").concat(name2)));
		System.out.println(name1+name2);
		System.out.println(name1.charAt(0));
		System.out.println(name1.toLowerCase());
		System.out.println("Bharaneedaran".length());
		System.out.println(name1.equals(name2)); */
	/* System.out.println("Enter the string: ");
	Scanner input=new Scanner(System.in);
	String word=input.nextLine();
	int L=word.length();
	if((L-8)>=0)
	{
	System.out.println(word.substring(0,L-3));
	}
		else
		{
			System.out.println("No substring exists"); */
		//System.out.println(word.index('o',6));
	//double a=(9.0/5);
		//System.out.println(a);
		
		
		
		//System.out.print(Character.isDigit(5));
	
		/*String name="Sukanya";
		System.out.print(name.substring(0,6));
		System.out.print(name.substring(0,6).equals("Sukany"));*/
		
		
		
/*String s="1234";
int number=Integer.parseInt(s);
System.out.println(s);*/
		
		
		//possible ways to combination of N=7;
		/*for (int i=1;i<=6;i++) {
			 for (int j=i+1;j<=7;j++){
			 System.out.println(i+ "  "+j); */
		/* String original, reverse = "";
	      Scanner input = new Scanner(System.in);
	     
	      System.out.println("Enter a string to reverse");
	      original = input.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1 ; i >= 0 ; i--)
	         reverse = reverse + original.charAt(i);
	         
	      System.out.println("Reverse of the string: " + reverse);	 */
			 
		/* int count = 1;
		do {
			System.out.println("Welcome to Java!");
			count = count + 1;
			} while (count < 1);*/
		/* int sum = 0;
		 int number = 0; while (number < 5) {
		  
		 number = number + 1;
		 if (number ==2 || number == 3) 
		 {
		 continue;
		 }
		 sum = sum + number;*/
		
		/* int sum = 0;
		 int number = 0;
		 while (number < 5) {
		 System.out.print("value is: " + number);
		 number = number + 1;
		 System.out.println("\tnumber is: " + number);
		 if (number ==2)
		 {
		 continue;
		 }
		 sum = sum + number;
		 System.out.println("\tSum: " +sum);
		 }*/
		int []originalArray=new int[20];
		 System.out.println("The original array is: ");
		 for (int i=0;i<20;i++) {
		 originalArray[i]=(int)(Math.random()*100);
		 System.out.print(originalArray[i]+" ");
		 }
		 
		 int []reversedArray=new int [20];
		 System.out.println("\nThe reversed array is: ");
		 for (int i=0;i<20;i++) {
		 reversedArray[i]=originalArray[19-i];
		 System.out.print(reversedArray[i]+" ");
		 }



	}
}

	
	
	
	

