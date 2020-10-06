//Computer
//Claire Choo
//05/24/2019

public class Computer {
	
	private String manufac;
	private double price;
	private int warranty;
	
	public Computer(String manufac, double price, int warranty)
	{
		this.manufac = manufac;
		this.price = price;
		this.warranty = warranty;
	}
	
	public void displayInfo()
	{
		
		System.out.println(" Manufacturer: " + manufac);
		System.out.printf(" Price: " + "$%.2f",price);
		System.out.println(" ");
		System.out.println(" Warranty: " + warranty + " year(s) ");
		System.out.println("\n");
		
		
	}
}
