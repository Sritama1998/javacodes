package encapsulationDemo;

public class Encapsul {
	private String name="sritama"; // hiding the data by making it private

	public String getName() { //showing is by getter method
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 public static void main(String[] args) {
		 Encapsul obj=new Encapsul();
		 System.out.println(obj.getName());
	 }
	

}
