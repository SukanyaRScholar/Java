package rehnuma;

public class StockTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Num_Shares=1000;
		final double Purchase_Price=32.87;
		final double Selling_Price=33.92;
		final double Broker_Comm_Rate=0.02;
		double Purchase_Commission = Purchase_Price * Broker_Comm_Rate * Num_Shares;
		double Total_Purchase = (Purchase_Price * Num_Shares) + Purchase_Commission;
		System.out.print("Purchase price is : " + Total_Purchase);
		double Sales_Commission= Selling_Price * Broker_Comm_Rate * Num_Shares;
		double Total_Sales = (Selling_Price * Num_Shares)-Sales_Commission;
		System.out.print("\nTotal sales amount received is : " + Total_Sales);
		double Profit = Total_Sales -Total_Purchase;
		System.out.print("\nTotal Profit is : " + Profit);
		

	}

}
