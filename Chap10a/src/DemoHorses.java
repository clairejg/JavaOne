//DemoHorse
//Claire Choo
//05/17/2019

import java.util.Scanner;

public class DemoHorses
{

   public static void main(String[] args) {
	   
      
	   Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter the name of the horse >> ");
       String name = inputDevice.nextLine();
       System.out.print("Enter the color of the horse >> ");
       String color = inputDevice.nextLine();
       System.out.print("Enter the birth year of the horse >> ");
       int year = inputDevice.nextInt();
       System.out.print("Enter name of the racehorse >> ");
       String nameRace = inputDevice.nextLine();
       inputDevice.nextLine();
       System.out.print("Enter color of the racehorse >> ");
       String colorRace = inputDevice.nextLine();
       System.out.print("Enter the birth year of the racehorse >> ");
       int yearRace = inputDevice.nextInt();
       
       System.out.print("Enter the number of races the racehorse has completed >> ");
       int numRace = inputDevice.nextInt();
       
       
       Horse h = new Horse();
       h.setName(name);
       h.setColor(color);
       h.setYear(year);
       
       RaceHorse R = new RaceHorse();
       
       R.setNameRace(nameRace);
       R.setColorRace(colorRace);
       R.setYearRace(yearRace);
       R.setNumRace(numRace);
       
      
       System.out.println( name + " is " + color + " was born in " + year + ".");
       System.out.println( nameRace + " is " + colorRace + " and was born in " + yearRace + ".");
       System.out.println( nameRace + " has been in " + numRace + " races.");
     
       inputDevice.close();
   }

}