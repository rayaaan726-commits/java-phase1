package phase1;

import java.util.Scanner;

public class Phase1Input {
	public static void main(String args []) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter your name :");
		 String name1 = input.nextLine();
		 
		 System.out.println("Please enter first number :");
		 int num1 = input.nextInt();
		 
		 System.out.println("Please enter second number :");
		 int num2 = input.nextInt();
		 
		 if (num2 != 0) {
			 System.out.println("Division :"+ (double) num1 /num2);
			
		}else {
			
			System.out.println("Error , Cannot devide by 0 !!");
		}
		 
		 System.out.println("Sum :"+(num1 + num2));
		 System.out.println("Difference :"+(num1 - num2));
		 System.out.println("Product :"+(num1 * num2));

		if (num1 > num2) {
			System.out.println("Frist number is greater than Second number");
			
		} else if (num1 < num2) {
			System.out.println("Frist number is Smaller than Second number");
			
		}else {
			System.out.println("the both Equal");
		}
		
	}

}
