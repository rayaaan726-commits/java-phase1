package phase1;

import java.util.Arrays;

public class phase1Search {
	public static int linearSearch(int [] arr , int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	public static void bubbleSort(int[] arr) {
	    for (int pass = 0; pass < arr.length - 1; pass++) {
	        for (int i = 0; i < arr.length - 1 - pass; i++) {
	            if (arr[i] > arr[i + 1]) {   // which comparison?
	                // swap using temp
	            	int temp = arr[i];
	            	arr[i] = arr[i + 1];
	            	arr[i + 1] = temp;
	            }
	        }
	    }
	}
	
	public static int binarySearch(int[] arr, int target) {
	    int low = 0;
	    int high = arr.length - 1;

	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (arr[mid] == target) {
	            return mid;
	        } else if (arr[mid] < target) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return -1;
	}
	
	
	
	public static void main(String args []) {
		
		System.out.println(linearSearch(new int[]{4, 9, 2, 7}, 7));   // 3
		System.out.println(linearSearch(new int[]{4, 9, 2, 7}, 5));   // -1
		System.out.println(linearSearch(new int[]{}, 5));             // -1
		
		System.out.println("___________________________________________________");
		int[] arr = {5, 3, 8, 1};
		bubbleSort(arr);                          // sorts arr itself
		System.out.println(Arrays.toString(arr)); // [1, 3, 5, 8]
		System.out.println("___________________________________________________");
		int [] arr2 = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		
		System.out.println(binarySearch(arr2, 8));
		
		int[] arr3 = {2, 5, 8, 12, 16, 23, 38};
		System.out.println(binarySearch(arr3, 23));   // 5
		System.out.println(binarySearch(arr3, 2));    // 0
		System.out.println(binarySearch(arr3, 38));   // 6
		System.out.println(binarySearch(arr3, 7));    // -1
		
	}

}
