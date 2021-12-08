package mixClass;
import java.util.Scanner;

public class NextLineEscape {

	public static void main(String[] args) {
		System.out.println("what is your name:");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("hi "+name);
//		if there is nextInt and then nextInt and nextline so program will escape the nextLine and thats why 
//		 we must put input.nextLine() after nextIne
		System.out.println("what is your age:");

		int age = input.nextInt();
		System.out.println("your age is "+age);
		input.nextLine();

		
		System.out.println("what is your addres:");
		String addres = input.nextLine();       // this line does work if there is no code in 19 line
		System.out.println(addres + " is good");
		
		input.close();

	}

	}


