package innerClass;

public class InnerClassDemo { 
	class outerClass{ // inner class is non-static
		public void show() {
			System.out.println("example of innerclass");
		}
		}
	static class outerClass2{ //nested class is static
		static void show2() {
			System.out.println("this is the example of nested class");
		}
	
	public static void main(String[] args) {
		outerClass2.show2();
		InnerClassDemo.outerClass obj= new InnerClassDemo().new outerClass();
		obj.show();
	}

	
	}}
