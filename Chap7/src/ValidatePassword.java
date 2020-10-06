//ValidatePassword
//Claire Choo
//05/03/2019


import java.util.Scanner;
public class ValidatePassword
{
public static void main(String[] args)

{

	String password;
	int countUpper=0;
	int countLower=0;
	int countDigit=0;


	Scanner input = new Scanner(System.in);	

do

{

System.out.print("\n\nEnter a new password.");

System.out.print("\n Must have the following: " +

"\n 6 characters long" + "\n 1 uppercase" + "\n 1 lowercase" + "\n 1 digit" + "         " + ">> ");

password = input.nextLine();


int len = password.length();

for(int x = 0; x < len; x++)

{

if(Character.isLetter(password.charAt(x)))

{
if(Character.isUpperCase(password.charAt(x)))

countUpper++;

else if(Character.isLowerCase(password.charAt(x)))

countLower++;

}

else if(Character.isDigit(password.charAt(x)))

countDigit++;

}if(len == 6 && countUpper >= 1 && countLower >= 1 && countDigit >= 1)

{
System.out.println("\n\nValid password.");

break;

}
else

{

System.out.print("\n The passowrd did not have the following: ");
if(len < 6)

System.out.print("\n at least 6 characters");

if(countUpper < 1)

System.out.print("\n at least 1 uppercase");

if(countLower < 1)

System.out.print("\n at least 1 lowercase");

if(countDigit < 1)

System.out.print("\n at least 1 digit. ");

}

}while(true); 
}
}
