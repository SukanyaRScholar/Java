package arrays;

public class ReverseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1=new int [20];
int[] array2=new int [20];
int i;
for(i=0; i<20; i++)
{
	array1[i]=-1000 + (int)( (Math.random() * 2001));//generates all integers from -1000 to 1000
	System.out.println( "Random number " + (i+1 )+ " is " +array1[i] + " ");
	
}
for(i=0; i<30; i++)
{
System.out.print("--- ");
}
System.out.println("\n");
for(i=0; i<=19; i++)
{
	array2[i]=array1[19-i];
	System.out.println("Reversed random number " + (20-i)+ " in new location "+ (i+1) + " is "+ array2[i] + " ");
	
}

}
}