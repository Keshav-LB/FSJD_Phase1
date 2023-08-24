package Day8_LiveSession;

/*Interface : It is referred to as the collection of public abstract method, default method, 
  static method and public static final variables.
An interface is represented by the keyword interface
We cannot create the object of an interface directly
By default any method present inside an interface is considered to be abstract
Inside an interface the default method is represented using default keyword
Inside an interface the static method is represented using static keyword
Any variable declared inside an interface is by default considered as public static final

In order to use the contents of an interface inside another class we must use the implements 
keyword

Note : In java we can make a variable as constant by using final keyword
*/

interface calcy1{
	int a =10;
	void add();//abstract method
	void sub();//abstract method
	
	default void mul() {System.out.println("Multiplication method from interface");}
	static void div() {System.out.println("Division method from interface");}
	
}
public class Interface1 implements calcy1{

	@Override
	public void add() {
		System.out.println("Add from normal class");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Sub from normal class");
	}
	
	public static void main(String[] args) {
		//calcy1 c1 = new calcy1();   //we cannot create object of interface class
		Interface1 i1 = new Interface1();
		i1.add();
		i1.sub();
		i1.mul();
		//i1.div();//static method cannot be called by child classes object
		calcy1.div();
	}

}
