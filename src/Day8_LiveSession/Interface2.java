package Day8_LiveSession;
/*
 * Can we create the object of an interface or abstract class???
 * We cannot create the object of an interface directly. But indirectly we can create the object of 
 * an interface using anonymous inner types.
 */

interface Test{
	void function1();
	void function2();
}

abstract class Test1{
	abstract void codeFun1();
	abstract void codeFun2();
	
}

class Test2{}

public class Interface2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		System.out.println("Address of T2: "+t2);
		
		Test t = new Test() {

			@Override
			public void function1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void function2() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		System.out.println("Address of T: "+t);
		
		Test1 t1 = new Test1() {

			@Override
			public void codeFun1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void codeFun2() {
				// TODO Auto-generated method stub
				
			}
			
		};
		System.out.println("Address of T1: "+t1);
		

	}

}
