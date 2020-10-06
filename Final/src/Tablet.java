//Tablet
//Claire Choo
//05/24/2019

public class Tablet extends Computer 
{
	
	int coupon;
	public Tablet (String manufac, double price, int warranty)
	{
		super(manufac, price, warranty);
	}
	@Override
	public void displayInfo() 
	{
	super.displayInfo();
	String manufac = null;
	if ( manufac == "Samsung")
		{
		System.out.println(" Coupon applied ");
		}
		
	}
	

}
