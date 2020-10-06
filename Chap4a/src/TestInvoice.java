//Chap4a
//Claire Choo
//03/15/2019

import java.text.DecimalFormat;

public class TestInvoice 
{
 	public static void main (String[] args)
 	{
 		Invoicing bookPrice = new Invoicing();
 		
 		DecimalFormat df = new DecimalFormat(".00");
 		
 		System.out.println("Price $" + df.format(bookPrice.ComputeInvoice(24.95)));
 		System.out.println();
 		
 		System.out.println("Price $" + df.format(bookPrice.ComputeInvoice(17.50, 4)));
 		System.out.println();
 		
 		System.out.println("Price $" + df.format(bookPrice.ComputeInvoice(10.00, 6, 20.00)));
       
 	}	
}
