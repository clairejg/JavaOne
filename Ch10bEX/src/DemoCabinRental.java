public class DemoCabinRental {

public static void main(String[] args) {
CabinRental c1 = new CabinRental(2);
CabinRental c2 = new CabinRental(4);

HolidayCabinRental hc1 = new HolidayCabinRental(2);
HolidayCabinRental hc2 = new HolidayCabinRental(4);

System.out.println("Low cabin #" + c1.getCabinNum() + " rate $" + c1.getRate());
System.out.println("High cabin #" + c2.getCabinNum() + " rate $" + c2.getRate());
System.out.println("Low Holiday #" + c1.getCabinNum() + " rate $" + hc1.getRate());
System.out.println("High holiday #"+ c2.getCabinNum() + " rate $" + hc2.getRate());

}
}