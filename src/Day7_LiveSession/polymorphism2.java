package Day7_LiveSession;
class vechicle{
	public void start() {System.out.println("Vechile Started.");}
	public void move() {System.out.println("Vechile Start Moving.");}
	public void stop() {System.out.println("Vechile Stopped.");}
}
class car extends vechicle{

	@Override
	public void move() {
		System.out.println("Car is Moving");
		super.move();
	}
	
}
class bike extends vechicle{

	@Override
	public void start() {
		System.out.println("Bike Started");
		super.start();
	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped");
		super.stop();
	}
	
}
class bus extends vechicle{

	@Override
	public void move() {
		System.out.println("Bus Started Moving.");
		super.move();
	}
	
}

class road{
	void permit(vechicle v) {
		v.start();
		v.move();
		v.stop();
	}
}

public class polymorphism2 {

	public static void main(String[] args) {
		road r = new road();
		
		car c = new car();
		r.permit(c);
		System.out.println("*******************");
		bike b = new bike();
		r.permit(b);
		System.out.println("*******************");
		bus bs = new bus();
		r.permit(bs);
	}

}
