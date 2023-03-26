package interThread;

public class Thread {
	int sum=0;
	void method() {
		synchronized(this) {
		for(int i=1;i<=20;i++) {
			sum=sum+100;
			this.notify();
		}	
			
		}}
		public static void main(String[] args) throws InterruptedException {
			Thread obj=new Thread();
			obj.method();
			synchronized(obj) {
			obj.wait();	
			System.out.println(obj.sum);
			}
			
		}
	}


