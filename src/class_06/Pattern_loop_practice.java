package class_06;

public class Pattern_loop_practice {

	public static void main(String[] args) {
		char ch = 'A';
	for(int row=1; row<=5; row++) {			
		
		for(int col=1; col<=row; col++) {
		  System.out.print(ch);	
		}
		System.out.print(row);
		System.out.println();		
	}
	
	}

}

