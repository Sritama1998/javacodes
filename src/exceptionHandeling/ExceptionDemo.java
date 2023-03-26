package exceptionHandeling;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("example-1");
		try {
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
		System.out.println("after exception");
	}
	}
}
