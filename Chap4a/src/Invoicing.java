//Chap4a
//Claire Choo
//03/15/2019

public class Invoicing
{
		
	public double ComputeInvoice(double price)
    { 
		double total;
		total = price*1.08;
		return total;    	
    }	
   
	public double ComputeInvoice(double price,int quant)
    { 
    	double total;
    	total= price*quant*1.08;
    	return total;  
    }	    
    
	public double ComputeInvoice(double price,int quant, double coupon)
    { 
    	double total; 
    	total = ((price*quant)-coupon)*1.08;
    	return total;  
    }
    
    

}