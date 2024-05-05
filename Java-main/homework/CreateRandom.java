package homework;
//programm to generate tow random number betwen 100 and 1000
//comput the minimum of the two number and the maximum 
//round the minimum to the nearest integer


public class CreateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double variable1= 100 + (Math.random()*900);
		double variable2= 100 + (Math.random()*900);
		System.out.print("The variables are: " + variable1 + " variable 2 : " + variable2);
		 System.out.println("Max is :" + Math.max(variable1,  variable2));
		 System.out.println("Max is :" + Math.round(Math.max(variable1,  variable2)));
		 
		 
		
	}

}
