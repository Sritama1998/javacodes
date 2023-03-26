package superKeyword;


 class SuperKey {
	String name="sritama";
	public void Super() {
		System.out.println(name);
	}}
class Superkey2 extends SuperKey{
	String name="sritama mukherjee";
	public void Super() {
		System.out.println(name);
	}
		public void display() {
			Super();
			super.Super(); //superkeyword stops to override
		}
		
	
	

	public static void main(String[] args) {
		Superkey2 obj=new Superkey2();
		obj.display();
		
		
		

	}

}
