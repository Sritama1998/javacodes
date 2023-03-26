package constructureOverloading;

	public class ConOverloadingDemo   
	{  
	    int i;   
	    public ConOverloadingDemo(int k)  
	    {  
	        i=k;  
	    }  
	    public ConOverloadingDemo(int k, int m)  
	    {  
	        System.out.println("Hi I am assigning the value max(k, m) to i");  
	        if(k>m)  
	        {  
	            i=k;   
	        }  
	        else   
	        {  
	            i=m;  
	        }  
	    }  
	  
	
	    public static void main (String args[])   
	    {  
	        ConOverloadingDemo test1 = new ConOverloadingDemo(10);  
	        ConOverloadingDemo test2 = new ConOverloadingDemo(12, 15);  
	        System.out.println(test1.i);  
	        System.out.println(test2.i);  
	    } } 


