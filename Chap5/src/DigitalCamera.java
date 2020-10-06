///DigitalCamera
//Claire Choo
//04/05/2019

public class DigitalCamera
{
	String brand;
	int numMegapix;
	double price;
	
	public DigitalCamera(String brand, int numMegapix)
	{
	this.numMegapix=numMegapix;
	this.brand=brand;
	
	final double PRICEONE = 99.00;
	final double PRICETWO = 129.00;
	
	if(numMegapix > 10)
	  {
		numMegapix = 10;
	  }
	if(numMegapix <= 6)
	  {
		this.price = PRICEONE;
	  }
	else
	  {
		this.price = PRICETWO;
      }
}	

	public void DigitalCameraDetails ()
	{
		System.out.printf( "Camera brand: " + brand + "   " + "Resolution: " + numMegapix + " megapixels" + "   " +"Sale price: " + "$%.2f", price);
		
       
	}
}
	
		
	
