package FinaliseMethod;

public class Garbage {
	void clean() {
		System.out.println("garbage is created");
	}
	protected void finalize() { //Finalized method occur before object to collect the garbage
		System.out.println("garbage is to be collected here");
		
	}
	public static void main(String[] args) {
		Garbage obj=new Garbage();
		obj=null;
		System.gc(); //this is the method to show is garbage on the screen
	}

}
