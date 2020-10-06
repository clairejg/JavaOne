//Chap3b
//Chinkyung Choo
//03/08/2019

import java.util.Scanner;
public class TestLease 
{

	public static void main(String[] args) 
	{
	Lease leaseOne = new Lease();
	Lease leaseTwo = new Lease();
	Lease leaseThree = new Lease();
	Lease leaseFour = new Lease();
	
	leaseOne = getData();
	leaseTwo = getData();
	leaseThree = getData();
	
	showValues(leaseOne);
	leaseOne.addPetFee();
	leaseOne.explainPetPolicy();
	
	showValues(leaseOne);
	showValues(leaseTwo);
	showValues(leaseThree);
	showValues(leaseFour);
	}
	private static void showValues(Lease leaseOne)
	{
		System.out.println("Your lease results: ");
		System.out.println("Name      : " + leaseOne.getName());
		System.out.println("Apartment : " + leaseOne.getApartmentNumber());
		System.out.println("Rent      : $" + leaseOne.getMonthlyRent());
		System.out.println("Term      : " + leaseOne.getLease() + "\n");
		
		
	}	
	
	
	private static Lease getData()
	{
		Scanner input = new Scanner(System.in);
		Lease lease = new Lease();
		String name;
		int apartmentNumber;
		int rent;
		int months;
	
		System.out.print("Enter lessee name >> ");
		name = input.nextLine();
		System.out.print("Enter apartment number >> ");
		apartmentNumber=input.nextInt();
		System.out.print("Enter rent >> ");
		rent = input.nextInt();
	System.out.print("Enter lease term in months >> ");
	months = input.nextInt();
	System.out.print("\n");
	
	lease.setName(name);
	lease.setApartmentNumber(apartmentNumber);
	lease.setMonthlyRent(rent);
	lease.setLease(months);
	return lease;
	
	}
}
	
	