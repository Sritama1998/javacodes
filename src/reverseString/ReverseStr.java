package reverseString;

import java.util.Scanner;

public class ReverseStr {
	public static void main(String[] args) {
		String n3="";
		System.out.println("enter the string-");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int n2=n.length();
		for(int i=n2-1;i>=0;i--) {
		 n3=n3+n.charAt(i);
		}
		System.out.println(n3);
		if(n.equals(n3)) {
		System.out.println("yes");}
		

}}
