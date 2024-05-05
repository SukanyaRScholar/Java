package SQUARE;

public class Square {

	
		private double sideLength;
		
		public Square()
			{
				sideLength=0;
			}
	
	
	
	
	public double getlength() {
		return(sideLength);
	}
public double setlength(double asideLength) {
	sideLength=asideLength;
	return sideLength;
}

	
	public double getPerimeter() {
		return 4* sideLength;
	}
	
	public double area() {
		return sideLength*sideLength;
	}
}

		
		
	

	
