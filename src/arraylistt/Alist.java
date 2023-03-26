package arraylistt;

import java.util.ArrayList;

public class Alist {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>() ;
		ArrayList<String> li=new ArrayList<String>() ;
				list.add(3);
				list.add(5);
				list.add(2);
				li.add("sritama");
				li.add("arka");
		
			for(int i=0;i<list.size();i++) {
				System.out.println( i+" "+ list.get(i));
				
			}

			for(int i=0;i<li.size();i++) {
				System.out.println(i+" "+li.get(i));
				System.out.println(li);
				
			}
			
			
		}
		
	}
	


