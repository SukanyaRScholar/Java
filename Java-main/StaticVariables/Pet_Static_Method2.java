package StaticVariables;

public class Pet_Static_Method2 {
	
	private String name;
	private int age;
	private double weight;
	public static String category ="cat"; // category is a static variable
			
			
	public static void writeOutput() {
		System.out.print("name " + name);//cannot have access to non-static field name;
		System.out.print("category" + category);	
	}
	
	public void writeOutput2() {
		System.out.print("name " + name);
		System.out.print("category" + category);
	}
	
	public static void writeOutput3() {
		writeOutput();
		writeOutput2();
	}

	public void writeOutput4() {
		writeOutput();
		writeOutput2();
	}
	
	public static void writeOutput5() {
		this.writeOutput();
		this.writeOutput2();
		
	}
	
	public void writeOutput6() {
		this.writeOutput();
		this.writeOutput2();
	}
	
	public static writeOutput7() {
		Pet_Static_Method2 test = new Pet_Static_Method2();
		test.name
		test.category;
	}
	
	public static void main(String[]args) {
		Pet_Static_Method2 yourPet= new Pet_Static_Method2();
		yourPet.writeOutput6();
	}
}
