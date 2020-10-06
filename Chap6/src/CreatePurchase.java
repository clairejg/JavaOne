//Createpurchase
//Claire Choo
//04/12/2019
import javax.swing.JOptionPane;
public class CreatePurchase
{

	public static void main(String[] args)
	{
    	int invoiceNumber=0;
        double saleAmount=0;
        
JOptionPane.showInputDialog(null, "Enter an invoice number" );
if((1000 <= invoiceNumber ) && (invoiceNumber <= 8000))
       {
	   if (saleAmount < 0 ) 
		{
		JOptionPane.showInputDialog(null, "Sale amount must be a positive number Enter sale amount");
		
		}  
       }
Purchase amount = new Purchase();
amount.setinvoiceNum(invoiceNumber);
amount.setsaleAmount(saleAmount);
amount.displayPurchase();


	else if (( invoiceNumber < 1000) || (invoiceNumber > 8000))
	{
		JOptionPane.showInputDialog(null, "Invoice number must be between 1000 and 8000 Enter an invoice number");
		
	} 	
  JOptionPane.showInputDialog(null, "Enter sale amount", "Input", JOptionPane.QUESTION_MESSAGE);
 	while(saleAmount < 0 ) 
 		{
 		JOptionPane.showInputDialog(null, "Sale amount must be a positive number Enter sale amount");
 		
 		}



}
}