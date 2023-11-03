package nested_if_quiz;

public class Quiz_16_20 {

	public static void main(String[] args) {
//16,20,23 
		int age;
		age=46;		 //33;
//		if(age >= 63) //63)
//			System.out.println("Senior Citizen");
//		else {
//			System.out.println("Junior Citizen");
			if(age < 12)
				System.out.println("Baby");
			if(age >=12 && age< 18)
				System.out.println("Teen");
			if(age>=18){
				System.out.println("Adult");
				if(age >=50)
					System.out.println("Senior Adult");
				if(age<= 46)
					System.out.println("Junior Adult");
			}
		//}

	}

}
