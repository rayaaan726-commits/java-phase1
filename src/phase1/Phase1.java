
package phase1;


import java.util.Iterator;
import java.util.Scanner;

public class Phase1 {
	// Exercise 5 : 
	public static boolean isEven(int n) {
		
		return  n %2 ==0;
	}
	
	public static int max(int a , int b) {
		if (a > b) {
	        return a;
	    }
	    return b;
	}
	
	public static long factorial(int n) {
		 long result = 1;
		 for (int i = 2; i <= n; i++) {
			  result = result* i;
		}
		 return result;
	}
	
	
	public static void printTable(int n) {
	    for (int i = 1; i <= 12; i++) {
	        System.out.println(n + " x " + i + " = " + (n * i));
	    }
	}
	
	public static String grade (int score) {
		if (score >= 95) {
			return "A+";
		}
		else if (score >= 90) {
			return "A";
	}
		
		else if (score >= 85) {
			return "B+";
		}
		else if (score >= 80) {
			return "B";
		}
		else if (score >= 75) {
			return "C+";
		}
		else if (score >= 70) {
			return "C";
		}
		else if (score >= 51) {
			return "D";
		}
			return "F";
	}
	
	
	/*int [] arr = {85, 92, 78, 90, 66};
		
		int sum2 = 0;
		for(int a :arr) {
			sum2 += a;
			
		}
		System.out.println(sum2);*/
	
	public static int sum(int[] arr) {
	    int total = 0;
	    for (int i = 0; i < arr.length; i++) {
	        total += arr[i];   // what goes here, the index or the item?
	    }
	    return total;
	}
	
	public static double  average(int [] arr) {
		
		return  (double) sum(arr) / arr.length;
	}
	
	public static int findMax( int [] arr) {
		 int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
	}
		return max;
		
	}
	
	public static void printReverse(int [] arr) {
		for (int i = arr.length -1; i >=0; i--) {
			System.out.print(" "+arr[i]);
		}
	}
	
	
	
	
	
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
		
		
		// Exercise 4 : loops
		
		 for (int i = 0; i < 11; i++) {
			 System.out.println("Number :"+i);
			
		}
		 
		 
		 System.out.print("Please enter a number :");
		 int num3 = input.nextInt();
		 for (int j = 1; j <= 12; j++) {
			 
			 System.out.println(num3 * j);
			
		}
		 
		 for (int l = 0; l <= 20; l+=2) {
			 System.out.println(l);
			
		}
		 
		 // Bonus 
		 
		 System.out.print("Please enter a number : ");
		 int n = input.nextInt();
		 int sum = n;
		 for (int i = n -1; i > 0 ; i--) {
			  sum = sum  * i;
		}
		 System.out.println(sum);

		input.close();
		
		// Exercise 5 : 
		System.out.println(isEven(5));
		
		System.out.println(max(5 , 6));
		
		System.out.println(factorial(0));   
		System.out.println(factorial(13));   
		System.out.println(factorial(20));
		
		
		printTable(7);
		
		
		// arrays and arraylist 
		
		int [] score  = {1 , 2 , 3 , 4 , 5};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println("________________________________________");
		for(int s : score) {
			System.out.println(s);
		}
		
		// sum and average
		int sum1 =0;
		for(int s :score) {
			sum1 += s;
			
		}
		System.out.println("________________________________________");

		System.out.println(sum1);
		System.out.println((double) sum / score.length);
		System.out.println("________________________________________");
		
		
		// Exercise 6 
		
		int [] arr = {85, 92, 78, 90, 66};
		
		int sum2 = 0;
		for(int a :arr) {
			sum2 += a;
			
		}
		System.out.println(sum2);
		
		System.out.println("Avarege :"+ (double) sum / arr.length);
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
		
		
		for (int i = arr.length -1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
		
		grade(90);
		
		 int[] scores = {85, 92, 78, 90, 66};
		    System.out.println((double)sum(scores)); 
		    System.out.println((double)sum(scores)/ scores.length); 
		    System.out.println(average(scores));
		    System.out.println(findMax(scores));
		    
		    System.out.println(findMax(new int[]{5}));            // expected: 5
		    System.out.println(findMax(new int[]{-3, -9, -1}));   // expected: -1
		    
		    printReverse(scores);
		
	}
	
	
	
			
}