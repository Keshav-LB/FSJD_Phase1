package Day6_LiveSession;
//shadowing problem: It is a situation where compiler is under in differentiating b/w -
//							-instance variable and local variable
//					-> We can overcome this situation by making use of this keyword.
class Dog1{
	private String name;
	private String color;
	private  int age;
	
	void setName(String name) {
		this.name= name;
	}
	void setColor(String color) {
		this.color=color;
	}
	void setAge(int age) {
		this.age= age;
	}
	
	String getName()
	{
		return name;
	}
	
	String getColor() {
		return color;
	}
	int getAge() {
		return age;
	}
	
}

public class PillarCode2 {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.setAge(2);
		d1.setColor("black");
		d1.setName("Rocky");
		
		System.out.println(d1.getAge());
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
	}

}
