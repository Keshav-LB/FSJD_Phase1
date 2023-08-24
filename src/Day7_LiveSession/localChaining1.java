package Day7_LiveSession;

class Dog1{
	String Dname;
	String Dbreed;
	int dob;
	String colour;
	
	public Dog1() {
		this("Marcus");
		this.Dname="Messi";
		this.Dbreed="Labra";
		this.dob=2023;
		this.colour="Golden";
		System.out.println("---------------");
		System.out.println(this.Dname);
		System.out.println(this.Dbreed);
		System.out.println(this.dob);
		System.out.println(this.colour);
		System.out.println("Inside *** 0 *** param constructor");
		System.out.println("---------------");

	}
	public Dog1(String Dname) {
		this("Marcus", "Beagle");
		this.Dname=Dname;
		System.out.println("---------------");
		System.out.println(this.Dname);
		System.out.println(this.Dbreed);
		System.out.println(this.dob);
		System.out.println(this.colour);
		System.out.println("Inside *** 1 *** param constructor");
		System.out.println("---------------");

	}
	public Dog1(String Dname, String Dbreed) {
		this("Marcus", "Beagle", 2020);
		this.Dname=Dname;
		this.Dbreed=Dbreed;
		System.out.println("---------------");
		System.out.println(this.Dname);
		System.out.println(this.Dbreed);
		System.out.println(this.dob);
		System.out.println(this.colour);
		System.out.println("Inside *** 2 *** param constructor");
		System.out.println("---------------");

	}
	public Dog1(String Dname, String Dbreed, int dob) {
		this("Marcus", "Beagle", 2020,"brown");
		this.Dname=Dname;
		this.Dbreed=Dbreed;
		this.dob=dob;
		System.out.println("---------------");
		System.out.println(this.Dname);
		System.out.println(this.Dbreed);
		System.out.println(this.dob);
		System.out.println(this.colour);
		System.out.println("Inside *** 3 *** param constructor");
		System.out.println("---------------");

	}
	public Dog1(String Dname, String Dbreed, int dob, String colour) {
		
		this.Dname=Dname;
		this.Dbreed=Dbreed;
		this.dob=dob;
		this.colour=colour;
		System.out.println("---------------");
		System.out.println(this.Dname);
		System.out.println(this.Dbreed);
		System.out.println(this.dob);
		System.out.println(this.colour);
		System.out.println("Inside *** 4 *** param constructor");
		System.out.println("---------------");

	}
	
	public String getDname() {
		return Dname;
	}
	
	public String getDbreed() {
		return Dbreed;
	}
	
	public int getDob() {
		return dob;
	}
	
	public String getColour() {
		return colour;
	}
}

public class localChaining1 {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		System.out.println(d1.getDname());
		System.out.println(d1.getDbreed());
		System.out.println(d1.getDob());
		System.out.println(d1.getColour());
	}
}
