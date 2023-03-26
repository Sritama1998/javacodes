package fibbonacci;

import java.util.Scanner;

public class Fibbo {
	
	public static void main(String[] args) {
		int a=0,b=0, c=1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<=n-1;i++) {
			a=b;
			b=c;
			System.out.println(a);
			c=a+b;
			}
		}

}
