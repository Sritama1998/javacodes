package staticDemo;

public class StaticDemo {
	static int a=10; //static variable
	int b=1000;      //normal variable
	public static void display() {   //static method
		System.out.println("show me");
	}
	public void display2() {         //normal method
		System.out.println("show me-2");
	}

	static { //showing no output
		System.out.println("sritama");
		int age=10;
		System.out.println(age); 
	}
	
	
public static void main(String[] args) {
	System.out.println(a);
	display();
	
	StaticDemo obj=new StaticDemo();
	System.out.println(obj.b);
	obj.display2();
	
}
}


