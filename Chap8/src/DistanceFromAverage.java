//DistanceFromAverage
//Claire Choo
//05/10/2019


import java.util.Scanner;

public class DistanceFromAverage
{
public static void main(String[] args)

	{
	Scanner input = new Scanner(System.in);	
	double userVal=0;
	int count=0;
	int max =10;
	double sum=0;
	double average=0;
	double[] distance = new double[max];
	int i;
	
	
	 
	 		
	
	for(i=0; i<max; i++ )
			{
		System.out.print("Enter a double value or enter 99999 to QUIT >> ");
		userVal= input.nextDouble();
		distance[i] =userVal; 
		
	
				if( distance[0] == 99999)
	    		{
					System.out.print("Program was terminated before data was entered!");
					System.exit(1);
	    		}
		
				else if (userVal != 99999) 
				{
		
					distance[i] =userVal; 
					sum= userVal+sum;
					count++;
					average=(sum/count);
				}
				
				else if (userVal == 99999)
				{
			
					for(i=0; i<count; i++)
		
					{
						double subtract=0;
						subtract = (distance[i]-average);
		
						System.out.printf("The value " + distance[i] + " is " + "%.2f", + subtract );
						System.out.println(" points away from the average of " + average );	
						
		
					}
					System.exit(1);		
					
			}
		}
				for(i=0; i<count; i++)
					{
					double subtract=0;
					subtract = (distance[i]-average);
	
					System.out.printf("The value " + distance[i] + " is " + "%.2f", + subtract );
					System.out.println(" points away from the average of " + average );	
					}
					System.exit(1);
			
		}
	
	}
