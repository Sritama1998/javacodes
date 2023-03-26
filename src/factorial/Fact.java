package factorial;

import java.util.Scanner;

public class Fact {
	static int f=1;
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		f=f*i;
			
		}
		System.out.println(f);
	}
}
