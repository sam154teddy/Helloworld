
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> al=new ArrayList<Integer>();

     al.add(1);
     al.add(2);
     al.add(3);
     al.add(4);
     al.add(5);
     al.add(5);
     
     Iterator itr=al.iterator();
//         while(itr.hasNext()) {
//        	 System.out.println(itr.next());
//            }
       al.remove(0);
       boolean flag=false;
       
       for(int a:al) {
    	   if(a==1) {
    		   System.out.println("number found");
 		   flag=true;
    		   break;
    	   }
    	   
       }
       if(flag==false) {
    	   System.out.println("number not found");
    	   
       }
       
       System.out.println(al.contains(2));
	}

}
