package polimorphism;

	public class Polimorph{  
		  void run(){
			  System.out.println("running");
			  }  
		}  
		class Polimorph2 extends Polimorph{  
		  void run(){
			  System.out.println("running safely with 60km");
			  }  
		  public static void main(String args[]){  
		    Polimorph b = new Polimorph2();//upcasting  
		    b.run();  
		  }  
		} 


