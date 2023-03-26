package internMethod;

public class Intern {
	public static void main(String[] args) {
		String str1="sritama";
		String str2=new String("sritama");
		str1=str2.intern();
		System.out.println(str1==str2);
	}
	
// it should return true because of intern keyword but don't know why it is not happening
}
