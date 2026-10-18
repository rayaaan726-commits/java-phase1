package phase1;
import java.util.Scanner;
public class practice {
	
	// Count digits 
	
	public static int countDigits(int n) {
		int count = 0;
		
		if (n == 0) {
		    return 1;
		}
		
		while(n != 0) {
			n = n /10;
			count ++;
		}
		return count;
	}
	public static void main(String args []) {
		System.out.println("Practice");
		
		// ticketPrice
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your age : ");
		int age = input.nextInt();
		if (age == 0 || age < 0) {
			System.out.println("Error , You entered a wrong age");
		}
		else if (age > 0 && age < 5) {
			System.out.println("Free ");
		}
		else if (age >= 5 && age <= 12) {
			System.out.println("child : 10");
		}
		else if (age >= 13 && age <= 17) {
			System.out.println("Teen : 15");
		}
		else if (age >= 18 && age <= 99) {
			System.out.println("Adult : 25");
		}
		else
			System.out.println("wrong , you entered an age bigger than 100");
		
		
		// print triangle
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("__________________________________________________");
		// Count digits
		System.out.println(countDigits(1));
	}

}
