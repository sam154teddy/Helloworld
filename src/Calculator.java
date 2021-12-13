
public class Calculator {
  /* int result;
	public int add(int arg1,int arg2) {
		
       return result = arg1 +arg2;
	}*/
	
	public static void main(String[] args) {
		/*Calculator c1= new Calculator();
		System.out.println("result="+c1.add(4, 5));*/
		
		
		/*int i=25;
		int j=30;
		i+=5;
		j-=5;
		System.out.print("Value if i is:");
		System.out.println(i);
		System.out.print("value of j is:");
		System.out.println(j);*/
	
		int[] arr= {1,2,3,2,4,3,5,2,3};
		for(int i=0; i<=arr.length;i++) {
			for(int j=i+1; j<=arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i ]);
				}
				
			}
		}
		
		
	}
	
}
