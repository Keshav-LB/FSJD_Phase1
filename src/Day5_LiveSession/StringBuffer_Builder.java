package Day5_LiveSession;

public class StringBuffer_Builder {

	public static void main(String[] args) 
	{
		 //Mutable String
		StringBuffer sbuf1 = new StringBuffer("Ravana");
		StringBuffer sbuf2 = new StringBuffer("Sita");

		sbuf1.append(sbuf2);
		System.out.println(sbuf1);
		
		StringBuilder sbldr1 = new StringBuilder("Keshav");
		StringBuilder sbldr2 = new StringBuilder("Mishra");

		sbldr1.append(sbldr2);
		System.out.println(sbldr1);

	}

}
