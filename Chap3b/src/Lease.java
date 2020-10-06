//Chap3b
//Chinkyung Choo
//03/08/2019

import java.util.Scanner;
public class Lease {

	private String Name;
	private double Apartment;
	private double Rent;
	private double Term;

	public Lease()
	{
	Name="XXX";	
	Apartment=0;
	Rent=1000;
	Term=12;
	}
	public void setName(String name) 
	{
	this.Name=name;
	}
	public void setApartmentNumber(int Apartment)
	{
	this.Apartment=Apartment;
	}
	public void setMonthlyRent (int Rent)
	{
	this.Rent=Rent;
	}
	public void setLease(int Term)
	{
	this.Term=Term;
	}
	
	public String getName()
	{
	return Name;
	}
	public double getApartmentNumber()
	{
	return Apartment;
	}
	public double getMonthlyRent ()
	{
	return Rent;
	}
	public double getLease()
	{
	return Term;
	}
	public void addPetFee()
	{
	
	Rent = Rent + 10;
	
	
	}
	public static void explainPetPolicy()
	{
		System.out.print("A pet fee of $10 is added to the monthly rent\n");
		
	}
	
	}
