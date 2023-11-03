package if_example;

public class quiz_41 {
//41,42, 44 same 
	public static void main(String[] args) {
		int number=23;
		String numstr=Integer.toString(number);
		int numLength=numstr.length();
		System.out.println("number length is : "+numLength);
		if(numLength==2) {
			System.out.println("it is a 2 character number");
		}else 
			System.out.println("it is a 1 character number");
		System.out.println("-------------------------------------");
		String name="SktItName";
		System.out.println("Name length is: "+name.length());
		
//20
		int year=1330;
		if(year%4==0 || year%100==0 || year%100==0 ) {
			System.out.println(year +" is a leap year");
		}else
			System.out.println(year +" is not a leap year");
		
//12
		float mynum=5.3f;
		if(mynum ==5.3f) {
			System.out.println("Both are equal");	//5.3 will print this 
		}else
			System.out.println("Both are not equal"); //5.3f will print this
		
		char ch = 'H';
		if (Character.isLowerCase(ch)) {
			System.out.println(ch + " a character is lowercase Case Letter");
		} else {
			System.out.println(ch + " a character is Upper Case Letter");
		}
	

	int num1 = 89;
	int num2 = 90;
	int num3 = 45;
	int num4 = 64;
	int num5 = 34;
	
	int shortestnum =num5;
	if(num2<=shortestnum)
	{
		shortestnum = num2;
	}else if(num3<=shortestnum)
	{
		shortestnum = num3;
	}else if(num4<=shortestnum)
	{
		shortestnum = num4;
	}else
	{
		shortestnum = num5;
	}System.out.println("The shortest number is: "+shortestnum);
	
	int largestnum = num1;
	
	if(num2>=largestnum)
	{
		largestnum = num2;
	}else if(num3>=largestnum)
	{
		largestnum = num3;
	}else if(num4>=largestnum)
	{
		largestnum = num4;
	}else
	{
		largestnum = num5;
	}System.out.println("The largest number is: "+largestnum);
}

}
