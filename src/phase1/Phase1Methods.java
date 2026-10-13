package phase1;

public class Phase1Methods {
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
	
	
	
	
	public static int sum(int[] arr) {
	    int total = 0;
	    for (int i = 0; i < arr.length; i++) {
	        total += arr[i];   
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

		int [] arr = {85, 92, 78, 90, 66};
		
		int sum2 = 0;
		for(int a :arr) {
			sum2 += a;
			
		}
		System.out.println(sum2);
		
		System.out.println("Avarege :"+ (double) sum(arr) / arr.length);
		
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
