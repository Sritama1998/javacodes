package toStringMethod;

public class toStringDemo { 
		 int rollno;  
		 String name;  
		 String city;  
		  
		 public toStringDemo(int i, String string, String string2) {
			
		}

		void Student(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		public String toString(){    //overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		}  
		 public static void main(String args[]){  
			 toStringDemo s1=new toStringDemo(101,"Raj","lucknow");  
			 toStringDemo s2=new toStringDemo(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);  //compiler writes here s1.toString()  
		   System.out.println(s2);   //compiler writes here s2.toString()  
		 }  
		}  


