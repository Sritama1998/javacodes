package overloading;

public class Constructure {
	void cons(String b) {
	System.out.println(b);
	}
	
	void cons(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Constructure obj=new Constructure();
		obj.cons("exampleE");
		obj.cons(10);
	}

}
