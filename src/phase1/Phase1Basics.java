package phase1;

import java.util.Scanner;

public class Phase1Basics {
	
	public static void main(String args []) {
		System.out.println("Hello wrold");
		
		String name = "Rayan";
		int age = 23;
		String magor = "Software engineering";
		double gpa = 3.574;
		
		System.out.println("Hi "+name);
		System.out.println("Your age is "+age);
		System.out.println("Your magor is "+magor);
		System.out.println("Your GPA is "+gpa);



// Lesson 2 : User input and operators 
		// Exercise 2 
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
