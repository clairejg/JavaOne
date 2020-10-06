//Chap3a
//Chinkyung Choo
//03/01/2019

public class Percentages
{
	public static void main(String[] args) {
	double one = 2.0;
 	double two = 5.0;
 	double outFirst;
 	double outSecond;
 	
 	outFirst = computePercent(one, two);
 	outSecond = computePercent(two, one);
 	
 	
 	System.out.println(one + " is " + outFirst + "% of " + two);

 	System.out.println(two + " is " + outSecond + "% of " + one);
 	
	}
	
	public static double computePercent(double one, double two) 
	{
		double percentage = one/two;
		percentage = percentage * 100;
		
		return percentage;
	}
}	

	
