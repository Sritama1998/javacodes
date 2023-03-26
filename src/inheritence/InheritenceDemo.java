package inheritence;

public class InheritenceDemo {
	String name="sritama";
	void printname() {
	System.out.println(name);

}}

class InheritenceDemo3 extends InheritenceDemo2 { //multilevel inheritance
	String surname ="Mukherjee";
	 void printsurname() {
		 System.out.println(surname); 
	 }
	 public static void main(String[] args) {
		 InheritenceDemo3 obj=new InheritenceDemo3();
		 obj.printname();
		 obj.printage();
		 obj.printsurname();
	 }}

