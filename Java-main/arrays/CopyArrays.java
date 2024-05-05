package arrays;

public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String[] cities= { "Dallas", "Austin", "Houston"};
		String[] citiesCopy=new String[cities.length];
		for (i=0; i<cities.length; i++) {
			citiesCopy[i]=cities[i];
			
			System.out.println(citiesCopy[i]);
		}
		System.out.println("");
		for(i=cities.length-1; i>=0; i--)//to arrange in descending order of the inputs
		{
			cities[i]=citiesCopy[cities.length-1-i];
			System.out.println(citiesCopy[i]);
		}

	}

}
