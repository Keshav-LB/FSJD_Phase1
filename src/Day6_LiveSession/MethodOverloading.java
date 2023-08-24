package Day6_LiveSession;
/*
 * what is method overloading?
 * 		It is an illusion of the programmer that one single method is overloaded with multiple tasks,
 * 		but in reality it is not the cases.
 * 
 * 		A method overloading means that multiple methods are present with similar name, similar return type,
 * 		similar number of parameters but will have different order of parameters.
 * 
 * 		In case of method overloading there is no prominence for the return type
 * 
 * 		It is also called as virtual polymorphism.
 */
class Calculator {

	int add(int a, int b)
	{
		return a+b;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
	double add(int a, float b)
	{
		return a+b;
	}
	
	double add(float a, int b)
	{
		return a+b;
	}
	double add(int a, float b, double c)
	{
		return a+b+c;
	}
	double add(float a, double b, int c)
	{
		return a+b+c;
	}
	double add(double a, int b, float c)
	{
		return a+b+c;
	}
	double add(int a, double b, float c)
	{
		return a+b+c;
	}	
}

public class MethodOverloading {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		float m=10.1f, n=20.1f, o=30.1f;
		double p=10.121, q=20.121, r=30.121;
		
		Calculator c1 = new Calculator();
		
		System.out.println(c1.add(a, b));
		System.out.println(c1.add(m, r, a));
		System.out.println(c1.add(a, r, m));
		System.out.println(c1.add(m,  n));
		

	}

}
