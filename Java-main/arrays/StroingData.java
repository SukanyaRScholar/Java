package arrays;
import java.util.*;
public class StroingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] mylist = new double [10];
		double sum=0;
		for(int i=0; i<10; i++)
		{
			mylist[i]=Math.random(); // or can use nextDouble()();
			System.out.println(mylist[i]);
			sum=sum+mylist[i];
		}
		System.out.println("Sum of the elements in the array is: " +sum);
		/*for(int i=1; i<=10; i++)
		{
			mylist[i-1]=Math.random();
			System.out.println("\t" +mylist[i-1]);
		}*/
		

	}

}
