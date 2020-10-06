import java.util.Scanner;
public class input 
{

	public static void main(String[] args) 
	{
		String name;
		int age;
		int zipcode;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println ("Please enter your name >>");
		name = inputDevice.nextLine();
		System.out.println (" My name is " + name );

		System.out.println ("Please enter your age and zipcode >>");
		age = inputDevice.nextInt();
		zipcode = inputDevice.nextInt();
		System.out.println (" My name is " + age + zipcode);

	}
		
}		
