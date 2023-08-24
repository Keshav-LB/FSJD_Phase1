package Day7_LiveSession;
import java.util.Scanner;

abstract class shapes{
	protected double area;
	
	void display()
	{
		System.out.println("Area: "+ area);
	}
	
	abstract void calculate();
	abstract void collectData();
}

class circle extends shapes{
	private double radius;
	@Override
	void calculate() {
		area = Math.PI * Math.pow(radius, 2);
	}

	@Override
	void collectData() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
	}}

class rectangle extends shapes{
	 private double length;
	 private double width;
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		 area = length * width;
	}

	@Override
	void collectData() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
		
	}}

class square extends shapes{
	private double side;
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		  area = Math.pow(side, 2);
	}

	@Override
	void collectData() {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter the side length of the square: ");
	     side = scanner.nextDouble();
	}}

//To Apply polymorphisms
class shape{
	void permit(shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}


public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new shape();
		circle circle = new circle();
        s.permit(circle);
        System.out.println("*******************");
        square square = new square();
        s.permit(square);
        System.out.println("*******************");
        rectangle rectangle = new rectangle();
        s.permit(rectangle);
	}

}
