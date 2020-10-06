//student.java
//Chinkyung Choo
//03/21/2019

public class Student
{
	String studentId;
	int testOne;
	int testTwo;
	int testThree;
	
	public Student(String studentId, int testOne, int testTwo, int testThree)
	{
		this.studentId=studentId;
		this.testOne=testOne;
		this.testTwo=testTwo;
		this.testThree=testThree;
	}
	
	public String getstudentId()
	{
		return studentId;
	}

	public void setstudentId(String studentId)
	{
		this.studentId = studentId;
	}
	public int gettestOne()
	{
		return testOne;
	}

	public void settestOne(int testOne)
	{
		this.testOne = testOne;
	}
	public int gettestTwo()
	{
		return testTwo;
	}

	public void settestTwo(int testTwo)
	{
		this.testTwo = testTwo;
	}
	public int gettestThree()
	{
		return testThree;
	}

	public void settestThree(int testThree)
	{
		this.testThree = testThree;
	}
	
	public double calcAverage (double average)
	{
		average = (testOne + testTwo + testThree)/ 3;
		
		return average;
	}
	 
	public void displayInfo (String studentId, int testOne, int testTwo, int testThree, double average)
	{
	
		
		
		System.out.println(" Student ID: " + studentId );
		System.out.println();
		System.out.println(" Test 1 score: " + testOne );
		System.out.println();
		System.out.println(" Test 2 score: " + testTwo );
		System.out.println();
		System.out.println(" Test 3 score: " + testThree );
		System.out.println();
		System.out.printf(" Average test score:" + " %.2f ", +  average);
		System.out.println();
		System.out.println();
	}
	
		

	}
			