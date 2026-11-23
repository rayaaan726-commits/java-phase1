package phase1;

import java.util.ArrayList;
import java.util.Arrays;

public class Review2 {
	public static int sum(int []arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i]; 
		}
		return total;
	}
	
	public static int countEven(ArrayList<Integer> list) {
		int count = 0;
		for(int n : list) {
			if (n %2 == 0) {
				count ++;
			}
		}
		return count;
	}
	
	public static int findMax(ArrayList<Integer> list) {
	    int max = list.get(0);
	    for (int i = 1; i < list.size(); i++) {
	        if (list.get(i) > max) {
	            max = list.get(i);
	        }
	    }
	    return max;
	}
	public static void main(String args []) {
		
		
		System.out.println(sum(new int [] {85 , 92 , 78}));
		
		System.out.println("___________________________________");
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(85, 92, 78, 90, 66));
		System.out.println(countEven(list));   // 4
		
		System.out.println("___________________________________");

		System.out.println(findMax(new ArrayList<>(Arrays.asList(-3, -9, -1))));
		
	}

}
