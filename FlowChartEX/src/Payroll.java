//Payroll
//Claire Chinkyung Choo
///08/31/2020

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double hrsWork;
	double payRate;
	Scanner input = new Scanner (System.in);
	
	System.out.print( " How many hours did you work this week? ");
	hrsWork = input.nextDouble();
	
	System.out.print( " What is you regular pay rate? ");
	payRate = input.nextDouble();
	
	if(hrsWork<=40){
		System.out.printf( " Regular pay is $" + (hrsWork*payRate) );
		System.out.print( " Overtime pay is $0 " );	
	}
	else {
		double overTime= (hrsWork-40)*1.5*payRate;
		double regular= 40*payRate;
		
		System.out.printf( " Regular pay is $" + regular );
		System.out.printf( " Overtime pay is $" + overTime );	
		
	}

	}

}
