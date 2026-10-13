package phase1;
import java.util.Scanner;

public class Phase1Loops {
	public static void main(String args []) {
		// Exercise 4 : loops
		
				 for (int i = 0; i < 11; i++) {
					 System.out.println("Number :"+i);
					
				}
				 
				 
				 System.out.print("Please enter a number :");
				 Scanner input = new Scanner(System.in);
				 int num3 = input.nextInt();
				 for (int j = 1; j <= 12; j++) { 
					 System.out.println(num3 * j);
				}
				 
				 for (int l = 0; l <= 20; l+=2) {
					 System.out.println(l);
					
				}
	}

}
