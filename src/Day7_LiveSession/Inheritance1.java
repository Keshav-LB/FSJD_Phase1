package Day7_LiveSession;
//Inheritance: It is a pillar of Object Orientation which is used to establish parent-child relationship
//which is nothing but hierarchy of classes.
//Note: Inheritance can be achieved using extends keyword.
//Inheritance promotes is-a type of relation

/*
* Rules of inheritance:
* 1. private members cannot inherited
* 2. Constructors cannot be inherited
* 3. A class cannot inherit multiple classes --> Diamond shape problem
* 4. We cannot implement multiple inheritance in java but we can implement multi-level inheritance
* 5. We cannot have cyclic inheritance in java


Different types of methods in inheritance:
1. Inherited methods
Methods that are inherited from the parent and are used as it is in the child
example: Height of a person, hair color, skin tone

2. Overridden methods
Methods that are inherited from the parent but are modified and used in the child
Overridden methods are indicated using the annotation @Override
example: Eye color, hair color

3. Specialized methods
Methods that are not inherited from the parent but are present in the child uniquely
example: Swim, bike ride
*/

class Plane
{
	void takeOff()
	{System.out.println("Plane Took OFF");}
	
	void fly()
	{System.out.println("Plane is Flying");}
	
	void land()
	{System.out.println("Plane Landed");}
}

class CargoPlane extends Plane
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

class PassengerPlane extends Plane
{
	
	@Override
	void fly()
	{System.out.println("PassengerPlane is Flying at medium height");}
	
	void carryPassengers()
	{System.out.println("PassengerPlane carry passengers");}
}
public class Inheritance1 {
	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		
		System.out.println("************************");
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassengers();

	}

}
