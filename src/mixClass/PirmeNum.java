package mixClass;
import java.util.ArrayList;
import java.util.Scanner;

public class PirmeNum {

	// method check all numbers between range in return all prime numbers in ArrayList
		public static ArrayList<Integer> check() {
			ArrayList<Integer> pirmeNum = new ArrayList<>();
			Scanner input = new Scanner(System.in);
			System.out.print("start no:");
			int start = input.nextInt();
			System.out.print("end no:");
			int end = input.nextInt();
			int faktor;
			int[] num = new int[(end - start) + 1];
			for (int i = 0, j = start; i < end - start + 1; i++, j++) {
				boolean isPrime = true;
				num[i] = j; // here by default the value from num[0] to num[start] is zero cause its int
							// items
				for (faktor = 2; faktor <= num[i] / 2; faktor++) {
					if (num[i] % faktor == 0) {
						isPrime = false;
						break;
					}

				}
				if (isPrime)
					pirmeNum.add(num[i]);
				
					
				input.close();

			}
			return pirmeNum;

		}
}
