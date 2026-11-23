package phase1;
import java.util.Iterator;
import java.util.Scanner;

public class redo {

		
	
		public static String ticketPrice(int age) {
		    if (age < 0 || age > 100) {
		        return "Error: invalid age";
		    } else if (age < 5) {
		        return "Free";
		    } else if (age < 13) {
		        return "Child: 10";
		    } else if (age < 18) {
		        return "Teen: 15";
		    }
		    return "Adult: 25";
		}
		
		public static void printTriangle(int n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void printTriangleReverse(int n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static int countDigits(int n) {
		    int count = 0;
		    while (n != 0) {
		        n = n / 10;
		        count++;
		    }
		    return count;
		}
		
		
	public static void main(String [] args) {
		System.out.println(ticketPrice(22));
		
		System.out.println("________________________________");
		
		printTriangle(4);
		
		System.out.println("________________________________");
		
		printTriangleReverse(4);
		
		System.out.println("________________________________");
		
		System.out.println(countDigits(12345));
	}
	
	

}
