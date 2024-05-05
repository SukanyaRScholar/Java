import java.util.*;
public class ClassWorkJan29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String month;

System.out.print("Enter the number");
Scanner input=new Scanner(System.in);
int number=input.nextInt();

switch(number)
{
case 1: 
	month="Jan";
      break;
     
case 2: 
	month="Feb";
      break;
case 3: 
	month="Mar";
      break;
case 4: 
	month="Apr";
      break;
case 5:
	month="May";
	break;
case 6:
	month="Jun";
	break;
case 7:
	month="Jul";
	break;
case 8:
	month="Aug";
	break;
case 9:
	month="Sep";
	break;
case 10:
	month="Oct";
	break;
case 11:
	month="Nov";
	break;
case 12:
	month="Dec";
	break;
default :
	month ="invalid";
	break;
  
}

System.out.print("The entered month is " + month);
	}

}
