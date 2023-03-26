package getterandsetterMethod;

public class getterMethod {
	
String name="sritama";
int age=24;
String getName;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 public static void main(String[] args) {
	 getterMethod obj=new getterMethod();  // get the value in getter method which is read only
	 System.out.println(obj.getName());
	 obj.setName("arka");                 //we set the value in setter method
	 System.out.println(obj.getName());
	 System.out.println(obj.getAge());
	 
 }
}
