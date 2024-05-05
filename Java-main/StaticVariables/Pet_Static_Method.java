package StaticVariables;

public class Pet_Static_Method {
	
	private String name;
	private int age;
	private double weight;
	private static String category="cat"; //category is a static variable
	
	
	public static void getcategory() {
		System.out.println(category);
	}
	
	public static void main(String[]args) {
	
	Pet_Static_Method.getcategory();
		
//		Pet_Static_Method yourPet1 = new Pet_Static_Method();
//		Pet_Static_Method yourPet2 = new Pet_Static_Method();
		
		Pet_Static_Method.getcategory();
		Pet_Static_Method.getcategory();
		
		Pet_Static_Method.category="dog";
		Pet_Static_Method.getcategory();
		Pet_Static_Method.getcategory();
		Pet_Static_Method.getcategory();
		
		
	}

}
