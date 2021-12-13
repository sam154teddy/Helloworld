
public class Examples {
	
	
	public void call() {
		System.out.println("parent method");
	}

	public static void main(String[] args) {
	}	
		
}


 class Example1 extends Examples{
	
	public void call() {
		//super.call();
		System.out.println("Child method");
		//super.call();
	}
	public static void main(String[]args) {
		Example1 e1=new Example1();
		Examples e=new Example1();
		
		
		e.call();
		e1.call();
	}
}