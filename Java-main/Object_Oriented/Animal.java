package Object_Oriented;

public abstract class Animal {  //super class

	public Animal(int i) {
		System.out.println("A new animal is created");
	}
	
	
	public abstract void sleep(); //two abstract methods created within the animal class
	public abstract void eat();
}
