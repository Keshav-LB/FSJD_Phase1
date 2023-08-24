package Day7_LiveSession;
/*Local Chaining in constructor:-> It is the process of taking the control from one constructor 
 * inside the class to another constructor inside the same class.
 * It is achieved using this() 
 * Note: We cannot use this() when super() is used and vice-versa because both the method calls must be the
 *    first line inside the constructor. Since both cannot be the first line we cannot use both together.
 * 
 */ 
class Car1{
	String brand;
	int cost;
	String color;
	int yom;
	
	public Car1() {
		this("Benz");
		this.brand="BMW";
		this.color="Blue";
		this.cost=3500000;
		this.yom=2019;
		System.out.println("Inside zero parameterized constructor");
	}
	
	public Car1(String brand) {
		this("Benz",2500000);
		this.brand=brand;
		System.out.println("Inside one parameterized constructor");
	}
	
	public Car1(String brand,int cost) {
		this("Benz",2500000,"red");
		this.brand=brand;
		this.cost=cost;
		System.out.println("Inside two parameterized constructor");
	}
	
	public Car1(String brand,int cost,String color) {
		this("Benz",2500000,"red",2023);
		this.brand=brand;
		this.cost=cost;
		this.color=color;
		System.out.println("Inside three parameterized constructor");
	}
	
	public Car1(String brand,int cost,String color,int yom) {
		this.brand=brand;
		this.cost=cost;
		this.color=color;
		this.yom=yom;
		System.out.println("Inside four parameterized constructor");
	}

	public String getBrand() {
		return brand;
	}

	
	public int getCost() {
		return cost;
	}

	
	public String getColor() {
		return color;
	}

	
	public int getYom() {
		return yom;
	}	
	
}
public class localChaining {

	public static void main(String[] args) {
		
		Car1 c1=new Car1();
		System.out.println(c1.getBrand());
		System.out.println(c1.getCost());
		System.out.println(c1.getColor());
		System.out.println(c1.getYom());

	}

}
