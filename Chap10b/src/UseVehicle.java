//UseVehicle
//Claire Choo
//05/24/2019
public class UseVehicle 
{	
	public static void main(String[] args)
	{
		int numWheel = 0;
		Car one = new Car(numWheel,30);	
		MotorCycle motor = new MotorCycle(numWheel,60);
		one.display();
		motor.display();

	}
}

