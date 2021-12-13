
public class numberToChar {
	
	public static void printNumToChar(int num1) {
		switch(num1) {
		
		case 1: System.out.print("One");
		         break;
		case 2: System.out.print("Two");
                 break;
		case 3: System.out.print("Three");
                 break;
		case 4: System.out.print("Four");
                 break;
		case 5: System.out.print("Five");
                 break;
		case 6: System.out.print("Six");
                 break;
		case 7: System.out.print("Seven");
                 break;
		case 8: System.out.print("Eight");
                break;
		case 9: System.out.print("Nine");
                 break;
		
		
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub	
		int num=1234;
		int num1=0;
		int num2=0;
		
		for(int k=0; k<num; k++) {
			if(num>=1000) {
			 num1=num/1000;
			 num2=num%1000;
			 printNumToChar(num1);
			System.out.print("Thousand");
			num=num2;
		//	System.out.println(num);
			}
			  else if(num>=100) {
				  num1=num/100;
				  num2=num%100;
				  printNumToChar(num1);
				System.out.print("Hundered");
				  num=num2;
			  }
			  else if(num>=10) {
				  num1=num/10;
				  num2=num%10;
				  printNumToChar(num1);
				  System.out.print("tens");
				  num=num2;	
				  
				 // System.out.println(num+"ones");
			  }
			  else {
				  num1=num;
				  printNumToChar(num1);
				  System.out.print("ones");
			 
			  }
		
		}
		
		
		
	}

}
