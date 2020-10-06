
public class ComputerOrder {
	
	public static void main(String[] args)
	{
		Computer one = new Computer("HP", 450.00, 2);
		Tablet two = new Tablet ("Samsung", 379.99, 1);
		Tablet three = new Tablet ("Apple", 599.99, 1);
		
		System.out.println(" Desktop Computer ");
		System.out.println(" ");
		one.displayInfo();
		
		System.out.println(" Tablet ");
		System.out.println(" ");
		two.displayInfo();
		
		System.out.println(" Tablet ");
		System.out.println(" ");
		three.displayInfo();
		
	}
	

}
