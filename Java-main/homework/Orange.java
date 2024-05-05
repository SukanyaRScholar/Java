package homework;

/*
 The total revenue for 2018 is $717000 
 Task1: Total revenue projected for 2025 is $885484.34
 Task2: Total revenue projected for 2025 without oWatch is $872540.22
 */

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] productName= { "oMac", "oPad", "oPhone", "oTv", "oWatch"};
int [] productPrice= {1300, 350, 900, 3000, 250};
int [] productSales= { 100, 150, 180, 120, 50};
double [] salesGrowthRate= { 2.25, 3.5, 1, 4.2, 0.5};
double[] productRevenue=new double[5];
int totalRevenue=0;
double totalRevenue2025=0;
double [] productSales2025=new double [5];
double[] productRevenue2025=new double [5];
double[] revisedRevenue2025=new double[4];
double totalrevisedRevenue2025=0;
int i;

for(i=0; i<5; i++)
{
	productRevenue[i]=productPrice[i]*productSales[i];
	totalRevenue=(int)(totalRevenue+ productRevenue[i]);	
}

System.out.print("\n\nThe total revenue for 2018 is $" + totalRevenue);
System.out.println(" ");

for(i=0; i<5; i++)//Task 1 Total revenue projected for 2025
{
productSales2025[i]=projSales(productSales[i],salesGrowthRate[i],7);
productRevenue2025[i]=productPrice[i]*productSales2025[i];
totalRevenue2025=totalRevenue2025 + productRevenue2025[i];
}
System.out.printf("\nTotal revenue projected for 2025 is $%4.2f" ,  totalRevenue2025);
//Task 2 oWatch discontinued and revenue projected for 2025 without oWatch

for(i=0;i<4;i++)
{
productSales2025[i]=projSales(productSales[i],salesGrowthRate[i],(2025-2018));
revisedRevenue2025[i]=productPrice[i]*productSales2025[i];
totalrevisedRevenue2025=totalrevisedRevenue2025 + productRevenue2025[i];
	}
System.out.printf("\n\nTotal revenue projected for 2025 without oWatch is $%4.2f" ,  totalrevisedRevenue2025);
	}

	public static double projSales (int baseSales, double GrowthRate, int numberOfYears){
		 
		 double projectedSales=0;
		 
		 projectedSales=(baseSales * Math.pow((1+ (GrowthRate/100)), numberOfYears));
		 
		 return projectedSales;
	}
}