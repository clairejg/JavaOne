//TestDigitalCamera
//Chinkyung Choo
//04/05/2019

import java.util.Scanner;
public class TestDigitalCamera 
{
	public static void main(String[] args) 
	{
		String brand;
		int pixel;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter camera brand >> ");
		brand = inputDevice.nextLine();

		System.out.println("Enter megapixels >> " );
		pixel = inputDevice.nextInt();


		DigitalCamera display = new DigitalCamera(brand, pixel);
		display.DigitalCameraDetails();

	}
}


