package Day6_LiveSession;


class Car{
	private String Carname;
	private String Carcolor;
	private long modelno;
	private String country;
	//Generic Setter
	void setData(String Carname, String Carcolor, long modelno, String country)
	{
		this.Carname=Carname;
		this.Carcolor=Carcolor;
		this.modelno=modelno;
		this.country=country;
	}
	//Generic Getter
	void getData()
	{
		System.out.println(Carname);
		System.out.println(Carcolor);
		System.out.println(modelno);
		System.out.println(country);
	}
	//Independent Setters
	void setName(String Carname) {
		this.Carname=Carname;
	}
	void setColor(String Carcolor) {
		this.Carcolor=Carcolor;
	}
	void setmodelno(long modelno) {
		this.modelno=modelno;
	}
	void setcountry(String country) {
		this.country=country;
	}
	//Independent Getters
	String getName() {return Carname;}
	String getColor() {return Carcolor;}
	long getmodelno() {return modelno;}
	String getCountryName() {return country;}
	
}
public class encapq1 {
	public static void main(String[] args) {
		Car t1 = new Car();
		t1.getData();
		System.out.println("------------");
		t1.setData("Mercedes", "Royal_Black", 12321, "Germany");
		t1.getData();
		System.out.println("------------");
		Car t2 = new Car();
		t2.setData("Bentley", "Navy_Blue", 10001, "England");
		t2.getData();
		System.out.println("------------");
		Car t3 = new Car();
		t3.setData("Tesla", "White", 12345, "America");
		t3.getData();
		System.out.println("------------");
		Car t4 = new Car();
		t4.setData("McLaren", "Orange", 12345678, "United_Kingdom");
		System.out.println("Car Name: "+t4.getName());
		System.out.println("Car Color: "+t4.getColor());
		System.out.println("Car ModelNo.: "+t4.getmodelno());
		System.out.println("Car CountryName: "+t4.getCountryName());
	}
}
