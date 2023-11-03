package class_06;

public class Pattern_practice {

	public static void main(String[] args) {
		
//		*1
//		**2
//		***3
//		****4
//		*****5
//		*****6
//		****7
//		***8
//		**9
//		*10
		char ch='*';
		for(int row=1; row<=5; row++) {	
			for (int col=1; col<=row; col++) {	
				System.out.print(ch);				
			}
			System.out.print(row);
			System.out.println();
		}
		int row1=6;
		for (int col=1; col<=row1-1; col++) {			
				System.out.print(ch);				
			}
			System.out.print(row1);
			System.out.println();		
		
		int ch1=5;
		for(int row=7; row<=10; row++) {
			ch1=ch1-1;
			for (int col=ch1; col>=1; col--) {		
				System.out.print(ch);
				
			}	
			System.out.print(row);
			System.out.println();		
		}
		
//		1
//		10
//		101
//		1010
//		10101
//		for(int row=1; row<=5; row++) {
//			
//			for (int col=1; col<=row; col++) {
//				System.out.print(col%2);
//				
//			}
//			System.out.println();
//			}
//		}		
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE
//	char ch = 'A';
//	for(int row=1; row<=5; row++) {				
//		for(int col=1; col<=row; col++) {
//		  System.out.print(ch);	
//		}
//		System.out.println();
//		
//	}
	
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		char ch = 'A';
//		for(int row=1; row<=5; row++,ch++) {			
//			
//			for(int col=1; col<=row; col++) {
//			  System.out.print(ch);	
//			}
//			System.out.println();
//			
	//	}
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		char ch = 'A';
//		for(int row = 1; row<=5; row++) {			
//			for(int col=1; col<=row; col++) {
//			
//				System.out.print(ch);			
//				
//			}
//			ch++;
//			System.out.println();
//		}

	}

}
