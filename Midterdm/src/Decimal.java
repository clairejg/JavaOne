
public class Decimal {

	public static void main(String[] args) 
	{
		double payRate = 15.00;
		double taxRate = 7.98;
		double grosspay = payRate*taxRate;
		double netRate = 3.233;
		double totalPay = grosspay*netRate;
		
			
		System.out.println("Gross pay is $" + grosspay);
		System.out.printf("%.2f", grosspay); 

		System.out.printf("Total pay is $%.3f", totalPay);
		
	}

}
