package Object_Oriented;

public class Bird extends Animal {  //bird class is a concrete class. 
	
	public Bird() {
		System.out.println("A new bird is created");
	}

	@Override //this is just a note and it doesnt affect the program
	//not necessary but a note
	public void sleep() {
		System.out.println("A bird sleeps");
		
	}
	
	@Override
	public void eat() {
		System.out.println("A bird eats");
	}
	
}
