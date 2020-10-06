public class MyClass{
	//Always begins with class name that matches the file name.
	// create file called MyClass.java
	public static void main(String[] args) {
		System.out.println("Hell World !!!!!!!!");
		
		//java type casting: when we assign a value of one data type to another 
		// data type


//1. Automatic type casting. Widening
//smallest type -> largest type
// char->int->float->double		
	int myIn = 3;
	double myDoub= myIn; // myIn will automatically change to double
		
		
		
// 2.Manual type casting.  Narrowing the type
	double myDouble = 9.9;
	int myInt = (int) myDouble; 
	//place the smaller type inside of paranthese
	// in front of the variable 
	System.out.println("");
	System.out.println(myIn);
	System.out.println(myDoub);
	System.out.println("");
	System.out.println(myDouble);
	System.out.println(myInt);   // 10?? or 9??
	
	
	
		
	}
}