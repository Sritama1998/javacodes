package inheritence;

public class InheritenceDemo2 extends InheritenceDemo { //single inheritance
	int age=24;
	 void printage() {
		 System.out.println(age); 
	 }
	// public class InheritenceDemo4 extends InheritenceDemo { //higherarchial inheritance
		//	int id=5;
		//	 void printid() {
			//	 System.out.println(id); 
		//	 }
	 public static void main(String[] args) {
		 InheritenceDemo2 obj=new InheritenceDemo2();
		 obj.printname();
		 obj.printage();
		 
}}
