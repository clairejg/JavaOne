public class Vehicle 
{
	
	int numWheel;
	int mpg;
	
	public Vehicle (int numWheel, int mpg )
	{
		this.numWheel = numWheel;
		this.mpg = mpg;
	}
	
	public void display()
	{
		String Car;
		String MotorCycle;
		Car = Integer.toString(numWheel);
		MotorCycle = Integer.toString(mpg);
		
		if(numWheel == 4)
		{
			System.out.println( " Car--> Wheels: " + numWheel +  "  Mpg: " + mpg);
		}
		
		else if(numWheel == 2)
		{
			System.out.println( " MotorCycle--> Wheels: " + numWheel +  "  Mpg: " + mpg);
		}
	}
	}

	

