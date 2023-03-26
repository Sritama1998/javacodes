package StringReverse;

import java.util.Scanner;

public class StringRev {  
public static String reverseString(String str){  
	
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
}   

public static void main(String[] args) {  
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the string-");
	String name=sc.nextLine();
    System.out.println(reverseString(name));  
        
    }  
}  
