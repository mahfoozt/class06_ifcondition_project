package nested_if_quiz;

public class Quiz_17 {
	public static void main(String[] args) {
//17,=18,=19,  21 same quiz
		int custAge = 24;		//30;
		if (custAge >= 60) {
			System.out.println("tax will be 0%");
			if (custAge > 70) {
				System.out.println("no service charge");
				System.out.println("discount will be added");
			}
	}else {
//			System.out.println("tax will be 10%");
//			if (custAge < 30) {
				System.out.println("Service charge will be added");
				System.out.println("No discount");
				//System.out.println("because customer is adult");
			}
		//}
	}
}
