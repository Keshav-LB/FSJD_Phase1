 package Day6_LiveSession;
//Constructor: It is a special type of setter that has the name same as the class name and it does not have 
//				any return type
//	The constructors are categorized into 2 types
//			1. default zero parameterized constructor
//			2. parameterized constructor
//	The constructor will be automatically called during the object creation
//	
//		Once the super() takes the control to Object class then the instance variables will get the 
//		-default values

//		constructor chaining : process of taking control from child class constructor to -
// 		-parent class constructor
//		Class without parent is called as an orphan class
//		All the orphan class will have Object class as its parent


class Cricketer1 extends Object{
	private String name;
	private String country;
	
	Cricketer1(){
		//super();  //----------> used to perform constructor chaining
		name = "Sachin";
		country = "India";
	}
	Cricketer1(String name, String country){
		this.name=name;
		this.country=country;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getname() {return name;}
	String getCountry() {return country;}
}

public class Constructor {

	public static void main(String[] args) {
	
		Cricketer1 c = new Cricketer1();
		c.setName("Dhoni");
		System.out.println("Player Name : "+ c.getname());
		System.out.println("Player Nationality : "+ c.getCountry());
		System.out.println("--------------------------------------");
		Cricketer1 c1 = new Cricketer1("Devon","nz");
		System.out.println("Player Name : "+ c1.getname());
		System.out.println("Player Nationality : "+ c1.getCountry());
		

	}

}
