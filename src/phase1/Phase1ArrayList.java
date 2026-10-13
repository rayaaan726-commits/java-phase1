package phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class Phase1ArrayList {
	
	// methods 
	
		// Exercise 1
		public static int sum(ArrayList <Integer> list) {
			int total = 0;
			for(int s : list) {
				total += s;
			}
			return total;
		}
		
		public static int findMax(ArrayList <Integer> list) {
			int max = list.get(0);
			for(int s : list) {
				if (s > max) {
					max = s;
				}
				
			}
			return max;
		}
		
		public static int countEven(ArrayList<Integer> list) {
		    int count = 0;
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i) % 2 == 0) {
		            count ++;   
		        }
		    }
		    return count;    
		}
	public static void main(String args []) {
		
		Scanner input = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList <>();
		System.out.println("Please enter a number (-1 if you want to stop)");
		int n = input.nextInt() ;
		
		
		while (n != -1) {
			list.add(n);
			System.out.println("Please enter a number (-1 if you want to stop)");
			n = input.nextInt();
			
		}
		
		
		System.out.println("You entered :"+list.size()+" numbers");
		System.out.println("The sum of numbers is:"+ sum(list) );
		System.out.println("The average of numbers is :"+ (double) sum(list) / list.size());
		System.out.println("The max number is :"+ findMax(list));
		System.out.println("Number of even Numbers is : "+countEven(list));
		
	}

}
