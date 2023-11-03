package nested_if_quiz;

public class Quiz_25 {

	public static void main(String[] args) {
		int num;
		num=35000;		
		if(num >=-32000 && num<=32000) 
			System.out.println("short number");						
		else if(num>=-128 && num <=128) 
			System.out.println("byte number");
		else
			System.out.println("int or long nnumber");
		
	}
}
