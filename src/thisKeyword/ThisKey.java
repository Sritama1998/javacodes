package thisKeyword;

public class ThisKey {
	 int a=10;
	public void This() {
		int a=50;
		System.out.println(this.a);
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
     ThisKey obj=new ThisKey();
 	obj.This();
     
	}

}
