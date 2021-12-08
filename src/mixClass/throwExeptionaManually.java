package mixClass;
import java.util.Scanner;

public class throwExeptionaManually {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
			boolean flag = false;
			do {
				System.out.println("enter your age:");
				try {
					int age = input.nextInt();
					if (15 >= age || age >= 50)
						throw new Exception();
					System.out.println("valid age");
					flag = true;
				} catch (Exception e) {
					String x = input.nextLine();    // this code to prevent infinite loop if user enter string instead int 
					System.out.println(x);   // this just for explain that the String value which the user entered wrong instead of int
					// have been stored in x and without this code will String value still stored in input.nextInt and ----> infinite
	//				(not int as out of range ) and the when user enter (int)out of range so it throws exception normally				
					System.out.println("invalid age");
				}
	
			} while (!flag);
	input.close();
		}

}
