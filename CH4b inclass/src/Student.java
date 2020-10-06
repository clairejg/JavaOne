
public class Student 
{
	private String studentName;
	private static String collegeName = "Fullerton";
	private static int studentId;
	
	
	public static void demoStaticMethod()
	{
		
		System.out.println("This demo is a static method");
		System.out.println (collegeName);
		
	}
	
	public void demoObjectMethod(String name, int id)
	{
		studentName = name;
		studentId = id;
		
		System.out.println("\nThis demo is a non-static method ");
		System.out.println(collegeName);
		System.out.println("Name: " + studentName + "ID: " + studentId );

	}

}
