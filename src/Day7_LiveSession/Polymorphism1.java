package Day7_LiveSession;

/*
 * 	Polymorphism: poly-->Multiple       morphism---->forms
 * 	It refers to 1:M relationships.
 */
class Plane1
{
	void takeOff()
	{System.out.println("Plane Took OFF");}
	
	void fly()
	{System.out.println("Plane is Flying");}
	
	void land()
	{System.out.println("Plane Landed");}
}

class CargoPlane1 extends Plane1
{ 
	@Override
	void takeOff()
	{System.out.println("Plane Took OFF");}
	@Override
	void fly()
	{System.out.println("CargoPlane is Flying at low height");}
	
	void carryGoods()
	{System.out.println("CargoPlane carry goods");}
}

class PassengerPlane1 extends Plane1
{
	
	@Override
	void fly()
	{System.out.println("PassengerPlane is Flying at medium height");}
	
	void carryPassengers()
	{System.out.println("PassengerPlane carry passengers");}
}
public class Polymorphism1 {
	public static void main(String[] args) {
		Plane1 ref;      //reference of Plane
		CargoPlane1 cp = new CargoPlane1();
		ref=cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		
		System.out.println("************************");
		System.out.println();
		
		PassengerPlane1 pp = new PassengerPlane1();
		ref=pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryPassengers();
	}

}
