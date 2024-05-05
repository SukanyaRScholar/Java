package rehnuma;
//this is a program to find out the number of energy drinkers and citrus drinkers


public class SurveyResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int Num_Surveyed = 12467;
		final double Energy_Drinkers_Pct = 0.14;
		final double prefer_Citrus_Pct= 0.64;
		
		int energy;
		System.out.print("The number surveyed is :" + Num_Surveyed );
		
		double energydrinkers =Num_Surveyed * Energy_Drinkers_Pct;
		energy=(int)energydrinkers;
		
		System.out.print("\nThe number of energy drinkers is :" + energy);
		
		int citrus;
		double citrusdrinkers = energydrinkers * prefer_Citrus_Pct;
		citrus=(int)citrusdrinkers;
		System.out.print("\nThe number of citrs drinkers is :" + citrus);
		
		
		
		
		
		
		
		

	}

}
