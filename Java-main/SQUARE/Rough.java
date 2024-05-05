package SQUARE;
import java.util.*;
public class Rough {

	public static void main(String[] args) {
		//Book book =  new Book();
		Scanner input=new Scanner(System.in);
	/*int a=5;
	a=3;
	int sum;
	String cat="";
	//for(int i=0; i<5;i++)
	//{
		 cat=cat+"s";
	//}

	System.out.print(cat);	*/
		/*double b=(double)(7/2);
		double d=(double)7/2;
		double c=7/2.0;
		System.out.println(1.0/3.0);
		System.out.println((double)1/3);
	System.out.println(b);
	System.out.println(c);
	int a=5;
	double boy=a;
	int k=20/(int)5.0;
	
	System.out.println(a);
	System.out.println(boy);
	System.out.println(k);
	String tarini="Tarini";
	System.out.println(tarini.length());
	String name="";
	
for(int i=(tarini.length()-1);  i>=0; i--)
{
	  name+=tarini.charAt(i);
}
System.out.println(name);*/
		
		
//double k = (1+3*5/3%2-2);	
//System.out.println(++k);

/*String greetings = " hello how are you doing ";
String greeting=greetings.trim();
System.out.println(greetings.length());
//System.out.println(greetings.length();
System.out.println("hello".length());
System.out.println(greetings.compareTo("Hello"));
System.out.println(greetings.compareTo("hello"));
System.out.println(greetings.compareToIgnoreCase("hello"));
System.out.println(greetings.substring(10));
System.out.println(greetings.substring(10,13));
System.out.println(greeting.replace('d','g'));

System.out.println("abc\\def");
System.out.println("\'");
System.out.println("\"");
System.out.println("\"Smili's work\"");*/
		/*String name1="Tarini";
		String name2="Sukanya";
		String temp="";
		
		if(name1=="Tarini")
		
			if(temp!="")
			System.out.print(name1);
		
		else 
			System.out.println("It is a valid string" + name2);*/
		Random r = new Random();
        System.out.println("The next random integer is " +  r.nextInt());
        System.out.println("The next random integer between 0 and 15 (15 not included) is " +  r.nextInt(15));
        System.out.println("The next random double is " +  r.nextDouble());
        System.out.println("The next random boolean is " +  r.nextBoolean());


        System.out.println("A random double generated using Math.random() is " + Math.random());



        int aRandomNo = 15 + (int)(Math.random()*(20-15 + 1));
        System.out.println("A random integer between 15 and 20 is " + aRandomNo);

	}
}

	
	