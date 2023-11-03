package class_06;

public class For_Loop_Arithmatic {

	public static void main(String[] args) {
		int n=5;
		do {
			System.out.println("n = "+n);
			n--;
		}while(n< 2);
	
		 int i=1;        
	        do{
	           if(i%2!=0){
	            System.out.println("Odd: "+i);
	            }else {
	            System.out.println("Even: "+i);
	            }
	            i++;
	        }while(i<=10);

		
		// 10+8+6+4+2=30
		//10+8+6+2=26
		int sum =0;
		for (int i1 = 10; i1>=2; i1-=2) {
			if(i1==4)continue;
			sum = sum+i1;
			System.out.print(i1);
			if(i1==2) break;
			System.out.print("+");
		}
		System.out.println("=" + sum);
		
		//10+8+6+2=26
		for (int i1=10; i1>0; i1--)	//print 10 9 8 7 6 5 4 3 2 1 
			System.out.print(i1+" ");
		
	}

}
