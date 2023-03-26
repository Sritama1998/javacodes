package primeNumber;

import java.util.Scanner;

public class Prime {
	public static  void main(String[] args) {
		int k = 0,n = 0;
		System.out.println("enter-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		for(int i=2;i<n;i++) {
			if(n%i==0) {
				k=1;
				break;
			}
			
		}
		if(k==0) {
		System.out.println(" prime");

		}else {
		System.out.println("not prime");

		}
	}

}
