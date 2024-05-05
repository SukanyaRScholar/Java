package ThisKeyword;

public class Pet_Variable_Hiding {
	
	private String name;
	private int age;
	private double weight;
	
	//self-defined default constructor
	
	public Pet_Variable_Hiding() {
		name="No name yet";
		age=1;
		weight=3;	
	}
	
	public void writeAge() {
		int age=5;
		System.out.println("Output of writeAge method without parameter");
		System.out.print("pet age is " + age);
	}
	
	public void writeAge(int age) {
		age=10;
		System.out.println("Output of writeAge method with parameter");
		System.out.print("pet age is " + age);
	}
	
	public void writeWeight(double weight) {
		weight=weight;
		System.out.println("This is the output of the writeWeight method");
		System.out.print("pet weigt is " + weight);
	}
	
	public void writeOutput() {
		System.out.print("pet age is " + age);
		System.out.print("pet weight is " + weight);
		System.out.print("pet name is " + name);
	}
	
	public static void main(String[]args) {
		Pet_Variable_Hiding yourPet= new Pet_Variable_Hiding();
		
		System.out.println("pet age is " + yourPet.age);
		System.out.println("pet weight is " +yourPet.weight);
		System.out.println("----------------");
		yourPet.writeAge();
		yourPet.writeOutput();
		System.out.println("@@@@@@@@@@@@@@@@@");
		yourPet.writeAge(20);
		yourPet.writeOutput();
		System.out.println("^^^^^^^^^^^^^^^^^^");
		yourPet.writeWeight(15);
		yourPet.writeOutput();
		System.out.println("----------------");
		yourPet.writeOutput();
		
	}
}
