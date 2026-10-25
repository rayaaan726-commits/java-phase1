package phase1;
import java.util.HashMap;


public class Review {
	public static HashMap<String , Integer> countWords(String [] words){
		HashMap<String , Integer> count = new HashMap<>();
		for (String w : words) {
		    count.put(w, count.getOrDefault(w, 0) + 1);
		}
		return count;
	}
	
	public static int firstRepeated(int[] arr ){
		 HashMap<Integer, Integer> seen = new HashMap<>();
		for (int a : arr) {
			if (seen.containsKey(a)) {
				return a;
			}
			seen.put(a, 1);
		}
		return -1;
	}	
	
	public static int binarySearch(int[] arr, int target) {
	    int low = 0;
	    int high = arr.length - 1;

	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (arr[mid] == target) {
	            return mid;
	        } else if (arr[mid] < target) {
	            low = mid + 1;       // target is in the right half
	        } else {
	            high = mid - 1;      // target is in the left half
	        }
	    }
	    return -1;
	}
	public static void main(String agrs []) {
		String[] words = {"a", "b", "a", "c", "a", "b"};
		System.out.println(countWords(words));
		
		System.out.println("_____________________________________");
		
		int [] arr = {11 , 12 , 13 , 14 , 29 , 31 , 44};
		System.out.println(binarySearch( arr , 29)); // print the position of 31 

		
	}

}
