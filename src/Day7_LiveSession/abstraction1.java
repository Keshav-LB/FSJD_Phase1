package Day7_LiveSession;
/*Abstraction: It refers to the process of hiding the implementation in the parent class and enforcing
				child class to provide the implementation.

What is abstract method?
	Any method which does not contain an implementation but has a signature and is associated with abstract 
	keyword is called as Abstract Method

What is abstract class?
	Any class that contains at-least one abstract method inside it is called an Abstract Class



Note: Since abstract class contains incomplete methods we cannot directly create the object of abstract class

*/
abstract class Plane2
{
	void takeOff()	{System.out.println("Plane Took OFF");}
	
	abstract void fly();//abstract method which promotes --> overridden methods
	
	void land()	{System.out.println("Plane Landed");}
}

class CargoPlane2 extends Plane2
{
	@Override
	void takeOff()	{System.out.println("CargoPlane Took OFF");}
	@Override
	void fly()	{System.out.println("CargoPlane is Flying at low height");}
	
	void carryGoods()	{System.out.println("CargoPlane carry goods");}
}

class PassengerPlane2 extends Plane2
{
	
	@Override
	void fly()	{System.out.println("PassengerPlane is Flying at medium height");}
	
	void carryPassengers()	{System.out.println("PassengerPlane carry passengers");}
}

class airport{
	void permit(Plane2 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
	
}

public class abstraction1 {

	public static void main(String[] args) {
		airport a = new airport();
	
		CargoPlane2 cg = new CargoPlane2();
		a.permit(cg);
		cg.carryGoods();
		System.out.println("**************************");
		PassengerPlane2 pp = new PassengerPlane2();
		a.permit(pp);
		pp.carryPassengers();
		
		//Plane2 p2 = new Plane2();         //Cannot create object of abstract class 
	}

}
