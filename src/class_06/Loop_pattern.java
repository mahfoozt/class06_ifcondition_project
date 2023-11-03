package class_06;

public class Loop_pattern {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {	// 0 1 2 3 5 6 7 8 9 10
			if (i==4)continue;		
			System.out.print(i+" ");
		}
		
		for (int i=3; i<=5; i+=1) {
			System.out.println("Dallas");
		}
		for(int i=0; i<5; i=5) {
			System.out.println("Hellooooo");//1 times print
			
		}
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			break;
		}
		
		int sum=0;
		for (int i = 2; i<=10; i=i+2) {// sum=30
			sum=sum+i;
		}
			System.out.println("sum = "+sum); 
					
		for(int i=10; i>0; i--)	//print 10 9 8 7 6 5 4 3 2 1 
			System.out.print(i+" ");
		
//		for(int j=9;j<=9;j--)
//		   System.out.println("Dallas");// print Dallas infinitly 
//		//print  1+3+5+7+9=25
		System.out.println();
		int s = 0;
		for (int i = 1; i < 17; i += 2) {
			s = s + i;
			System.out.print(i);
			if (i !=15)
				System.out.print("+");
		}
		System.out.println("=" + s);
		
//		for(int i=2;i<=10;i+=2){	//i=2, print 2,4,6,8,10 
//		for (int i = 2; i<=10; i=i+2)
//			System.out.println(i);
//		
//		for(int i=1;i<=10;i+=2){//i=1, print 1 3 5 7 9 
//			System.out.print(i+" ");
//		}
//		
		//for(int j=1;j<=10;j++)
	       // System.out.println("Dallas");// print Dallas 5 times
			//System.out.print(j+" ");
			//		for(int i = 0; i<3; i=3 )
//		  {
//		         System.out.println("JAVA");
//		  }
//		 for(int i = 0; i>5; )	//< infinitely,  >No output can be seen
//		  {
//		          System.out.println("LAVA");
//		  }
		for(int i = 0; i<5; i+=2)
		  {
		  System.out.println("LAVA");//2 times
		  //i++; 
		  //i--; //5 times
		  //i+=2;	//2 times
		  }
		
		for(int i = 0; i<5; i++)
		  {
		  System.out.println("JAVA"); 
		  i++;
		  //continue;
		 // break;
		  }
//		for(int i=0 ;; i++) 
//			  System.out.println("HELLOW WORLD");//infinite times
		

	}

}
