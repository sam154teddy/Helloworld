
public class Testthread  extends Thread{
 
	public void run() {
		for(int i=0; i<=10;i++) {
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			         }
			    System.out.println("Thread"+i+" is running");
			       }
	            }
	public static void main(String[] args) {
		
		Testthread t1=new Testthread();
		Testthread t2=new Testthread();
		t1.start();
		t2.start();
		
		
	}
	
}
