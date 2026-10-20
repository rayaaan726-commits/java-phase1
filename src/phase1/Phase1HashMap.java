package phase1;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;
public class Phase1HashMap {
	
	public static HashMap<String, Integer> countWords(String[] words) {
	    HashMap<String, Integer> counts = new HashMap<>();
	    for (String w : words) {
	    	counts.put(w, counts.getOrDefault(w, 0) + 1);
	    }
	    return counts;
	}
	public static int firstRepeated(int[] arr) {
	    HashMap<Integer, Integer> counts = new HashMap<>();
	    HashMap<Integer, Integer> seen = new HashMap<>();
	    for (int a : arr) {
	        if (seen.containsKey(a)) {
	            return a;      // already seen: this is the answer
	        }
	        seen.put(a, 1);      // first time: remember it
	    }
	    return -1;
	}
	
	public static void findByName(HashMap<String, Student> map, String name) {
	    Student s = map.get(name);
	    if (s == null) {
	        System.out.println("Student Not found ");
	    } else {
	        System.out.println(s);
	    }
	}
	
	public static void main(String [] args) {
		
		String[] words = {"a", "b", "a", "c", "a", "b"};
		System.out.println(countWords(words));   // a=3, b=2, c=1 (order may vary)
		System.out.println(countWords(new String[]{}));            // {}
		System.out.println(countWords(new String[]{"x"}));         // {x=1}
		System.out.println(countWords(new String[]{"A", "a"}));    // two keys: "A" and "a" are different
		
		HashMap<String, Student> map = new HashMap<>();
		map.put("Sara", new Student("Sara", 92));
		map.put("Omar", new Student("Omar", 78));

		findByName(map, "Sara");   // Sara: 92 (A)
		findByName(map, "Zed");    // Student not found
		
		Scanner input = new Scanner(System.in);
		while (true) {
		    System.out.print("Enter a name (or exit): ");
		    String name = input.nextLine();
		    if (name.equals("exit")) {
		        break;
		    }
		    findByName(map, name);
		}
		input.close();
		
		
		
		System.out.println(firstRepeated(new int[]{3, 5, 2, 5, 3}));   // 5
		System.out.println(firstRepeated(new int[]{1, 2, 3}));         // -1
		System.out.println(firstRepeated(new int[]{}));                // -1
	}
	

}
