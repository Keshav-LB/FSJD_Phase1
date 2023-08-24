package Day6_LiveSession;

class Cricketer{
	private String Cricketername;
	private String Cricketer_Role;
	private long Age;
	private int matches;
	private String Nationality;
	//Generic Setter
	void setData(String Cricketername, String Cricketer_Role, long Age, int matches, String Nationality)
	{
		this.Cricketername=Cricketername;
		this.Cricketer_Role=Cricketer_Role;
		this.Age=Age;
		this.matches=matches;
		this.Nationality=Nationality;
	}
	//Generic Getter
	void getData()
	{
		System.out.println(Cricketername);
		System.out.println(Cricketer_Role);
		System.out.println(Age);
		System.out.println(matches);
		System.out.println(Nationality);
	}
	//Independent Setters
	void setCricketername(String Cricketername) {
		this.Cricketername=Cricketername;
	}
	void setCricketer_Role(String Cricketer_Role) {
		this.Cricketer_Role=Cricketer_Role;
	}
	void setAge(long Age) {
		this.Age=Age;
	}
	void setmatches(int matches) {
		this.matches=matches;
	}
	void setNationality(String Nationality) {
		this.Nationality=Nationality;
	}
	//Independent Getters
	String getCricketername() {return Cricketername;}
	String getCricketer_Role() {return Cricketer_Role;}
	long getAge() {return Age;}
	int getmatches() {return matches;}
	String getNationality() {return Nationality;}
	
}
public class question1 {

	public static void main(String[] args) {
		Cricketer t1 = new Cricketer();
		t1.getData();
		
		System.out.println("------------");
		t1.setData("Virat_Kohli", "Batsman", 34, 150, "INDIA");
		t1.getData();
		
		System.out.println("------------");
		Cricketer t2 = new Cricketer();
		t2.setData("Devon_Convoy", "Batsman",31, 100, "NEW_ZEALAND");
		t2.getData();
		
		System.out.println("------------");
		Cricketer t3 = new Cricketer();
		t3.setData("Md_Shami", "FastBOwler", 32, 50 , "India");
		t3.getData();
		System.out.println("------------");
		
		Cricketer t4 = new Cricketer();
		t4.setData("Cameron_Green", "All_Rounder", 24, 25 , "Australia");
		System.out.println(t4.getCricketername());
		System.out.println(t4.getCricketer_Role());
		System.out.println(t4.getAge());
		System.out.println(t4.getNationality());
	}

}
