
public class Student {

	int stuNum;
	double gpa;
	
	public Student (int studentNum, double score)
	{
		stuNum = studentNum;
		gpa = score;
	}
	public void showStudent()
	{
		System.out.println("Student #" + stuNum + " gpa is " + gpa );
	}
}
