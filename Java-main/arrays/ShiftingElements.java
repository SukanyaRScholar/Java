package arrays;

public class ShiftingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] mylist=new double [10];
		int i;
         double first=mylist[0];
         double last=mylist[9];
         for (i=0; i< mylist.length; i++) {
        	 mylist[i]=Math.random();
         }

        for(i=1; i<mylist.length; i++) {
        			 mylist[i-1]=mylist[i];
        			System.out.println(mylist[i]); 
        		 }
        System.out.println(last);
	}

}
