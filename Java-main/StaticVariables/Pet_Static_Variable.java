package StaticVariables;

public class Pet_Static_Variable {

	private String name;
	private int age;
	private double weight;
	private static String category="cat"; //category is a static variable
	
	
	
	public static void main(String[]args) {
	
		System.out.println("direct access " +Pet_Static_Variable.category);
		
		Pet_Static_Variable yourPet1 = new Pet_Static_Variable();
		Pet_Static_Variable yourPet2 = new Pet_Static_Variable();
		
		System.out.println("Access using instance reference " + yourPet1.category);
		System.out.println("Access using instance reference " + yourPet2.category);
		
		yourPet2.category="dog";
		System.out.println("After category change: " + yourPet1.category);
		System.out.println("After category change: " + yourPet2.category);
		System.out.println("After category change: " + Pet_Static_Variable.category);
		
		
	}
	
	
}
