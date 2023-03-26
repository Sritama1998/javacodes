package interfaceExample;

 interface InterfaceDemo {
	public void a();
	public void c();
		
	}
 class b implements InterfaceDemo {
 public void a() {
	 System.out.println("this is an example of interface");
	 
 }
 public void c() {
	 System.out.println("this is an example of interface no 2");
	 
 }
 
 
 public static void main(String[] args) {
	 b obj=new b();
	 obj.a();
	 obj.c();
	 
 }
 
	
	
 }
	


