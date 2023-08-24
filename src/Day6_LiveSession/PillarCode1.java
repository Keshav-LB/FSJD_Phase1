package Day6_LiveSession;
/*
 * Pillars of Object Orientation
 * ------>4 Pillars
 * 		1.Encapsulation: It is the pillar that provides security to the most important 
 *                        component of an object.
 * 		2.Inheritance: It refers to the process of establishing  parent-child relationships.
 * 
 *      3.Polymorphism: It refers 1:M relations
 *      
 *      4.Abstraction: It refers to the process of hiding the implementation.
 * 
 */

/*
 * 		Encapsulation :
 * 		***Rule to be followed while encapsulating the program
 * 
 * 							1.Use of Private members
 * 							2. Use of Setters and Getters
 */

class Tiger{
	private String name;
	private String color;
	private int age;
	private String country;
	
	//Generic Setter
	void setData(String name, String color, int age, String country)
	{
		this.name=name;
		this.color=color;
		this.age=age;
		this.country=country;
	}
	//Generic Getter
	void getData()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(country);
	}
	
}

public class PillarCode1 {

	public static void main(String[] args) {		
		Tiger t1 = new Tiger();
		t1.getData();
		System.out.println("------------");
		t1.setData("Ramu", "Orange", 5, "India");
		t1.getData();
		
	}

}
