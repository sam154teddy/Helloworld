
/*public class First {
	public static void statictest() {
		System.out.println("Static test");
	      }
	public void nonstatictest() {
		System.out.println("Non Static test");
	}
	public static void main (String[] args) {
		System.out.println("Hello World");
		First F1=new First();
		F1.nonstatictest();
		statictest();
		try {
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
		a[3]=30;
		System.out.println(a[0]);
		
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println(e);
		}
	System.out .println("Array");
		}
}
*/

public class First{
int a;


  public First(int a)
 {
			this.a=a;
		}
  public  void display() {
	System.out.println(a);  
  }
  
  public static void main (String[] args) {
First f=new First(10);
int b=10;

switch(b)
{
	case 5:
		System.out.println("Number is 5");
		break;
	case 10:
		System.out.println("Number is 10");
	  break;
	  
	default:	
		
	 System.out.println("Default");
	 
  
  }

String s4="Welcom";
StringBuffer s= new StringBuffer(s4);
s=s.reverse();
System.out.println(s);
  }}

