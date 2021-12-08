package mixClass;


import java.util.InputMismatchException;
import java.util.Scanner;

public class infenitiLoopException {

	public static void main(String[] args) {
		
		int age;
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		do {
		try {
				System.out.print("enter your age: ");
				age = input.nextInt();
//				throw new InputMismatchException();

				if (age < 18) {
					System.out.println("you are not allowed.");
					flag = true ;

				} else {
					System.out.println("you welcome.");
					flag = true;
				}
		}
		catch(InputMismatchException e) {
// this code to take the invalid value which we entered in line 16 and saved here otherwise it will be infinite loop		
			input.nextLine();       
			System.out.println(e);     // this will print the type of Exception
//			System.out.println("invalid value!");
//			System.out.println("InputMismatchException");
			System.out.println(e.getMessage());          // here the message is null 
			System.out.println(e.toString());           
			
		}

			
			
	}while(! flag);
		input.close();

}
}