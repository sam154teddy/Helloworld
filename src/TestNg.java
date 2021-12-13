
public class TestNg {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		int [] arr = {12,23,2,34,12,18};
//		int count=0;
//		int temp=0;
//		for(int i=0;i<arr.length-1; i++) {
//			
//			for(int j=i+1;j<arr.length-1;j++) {
//				
//				if(arr[i]==arr[j] && arr[i]!=0) {
//					count=count+1;
//					
//				}
//				
//				
//				
//			}
//			temp=arr[i];
//			System.out.println(arr[i]+"repeated these msny times"+count);
//			
//		}

		int num=1234;
		int num1=0;
		int num2=0;
		
		//public void placeAndValue() {
			
		
		
		for(int k=0; k<num; k++) {
		if(num>=1000) {
		 num1=num/1000;
		 num2=num%1000;
		System.out.print(num1+"Thousand");
		num=num2;
	//	System.out.println(num);
		}
		  else if(num>=100) {
			  num1=num/100;
			  num2=num%100;
			System.out.print(num1+"Hundered");
			  num=num2;
		  }
		  else if(num>=10) {
			  num1=num/10;
			  num2=num%10;
			  System.out.print(num1+"tens");
			  num=num2;	 
			  //System.out.println(num+"ones");
		  }
		  else {System.out.print(num+"ones");
		 
		  }
		//System.out.print(num1);
//		if(num<10) {
//			break;
//		}
		  }
		//count=count+1;
		//placeAndNumberValue();
	//	}
//		System.out.println(count);
//		//placeAndNumberValue()
//	   num=num/10;
//	System.out.println(num);
//	
	}
	
	

}
