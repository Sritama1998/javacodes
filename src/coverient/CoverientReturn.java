package coverient;

public class CoverientReturn {
	//class Coveri{
	
	CoverientReturn show() {
		System.out.println("example of coverient return type");
		return this;  /* since we have written the class name instead of int thatswhy
		                returing this */
	}
	public static void main(String[] args) {
		CoverientReturn a=new CoverientReturn();
		a.show();
		
	}}
		
	

	