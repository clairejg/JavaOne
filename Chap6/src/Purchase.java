//Purchase
//Claire Choo
//04/12/2019

public class Purchase 
{
	int invoiceNumber;
	double saleAmount;
	double saleTax;
	
	public void setinvoiceNum(int invoiceNumber)
	{
		this.invoiceNumber=invoiceNumber;
	}
		
	public void setsaleAmount(double saleAmount)
	{
		this.saleAmount=saleAmount;
		this.saleTax=saleAmount*.05;
	}
	public void displayPurchase ()
	{	
		System.out.print("Invoice number " + "#" + invoiceNumber);
		System.out.printf("Amount of sale: " + "$.2f", + saleAmount);
		System.out.printf("Tax: " + "$.2f", saleTax);
	}
	
		

	}