package Object_Oriented;

public class AnimalDemo {
	

	public static void main(String[]args) {
	Animal[] animals = new Animal[2];
	
	animals[0] = new Bird(); // we are using object from the subclass
	animals[1] = new Dog();

	
	for(Animal a: animals) {
		a.sleep();//application of polymorphism principle
		a.eat();
	}
	
}
}