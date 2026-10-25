package phase1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Phase1HashMap {
	
	public static HashMap<String, Integer> countWords(String[] words) {
	    HashMap<String, Integer> counts = new HashMap<>();
	    for (String w : words) {
	    	counts.put(w, counts.getOrDefault(w, 0) + 1);
	    }
	    return counts;
	}
	public static int firstRepeated(int[] arr) {
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
	
	public static String reverseWord(String word) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < word.length(); i++) {
		    stack.push(word.charAt(i));
		}

		String reversed = "";
		while (!stack.isEmpty()) {
		    reversed += stack.pop();
		}
		return reversed;
	}
	public static boolean isBalanced(String text) {
	    Stack<Character> stack = new Stack<>();
	    for (int i = 0; i < text.length(); i++) {
	        char c = text.charAt(i);
	        if (c == '(') {
	            stack.push('(');
	        } else if (c == ')') {
	            if (stack.isEmpty()) {
	               return false;
	            }
	           stack.pop();
	        }
	    }
	    if (stack.isEmpty()) {
            
         }
	    	return stack.isEmpty();
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
		
		/*String word = "java";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < word.length(); i++) {
		    stack.push(word.charAt(i));
		}

		String reversed = "";
		while (!stack.isEmpty()) {
		    reversed += stack.pop();
		}
		System.out.println(reversed);*/   // avaj
		
		System.out.println(reverseWord("Ahmad"));
		System.out.println(reverseWord("java"));

		
		System.out.println(isBalanced("(a+b)"));   // true
		System.out.println(isBalanced("((a)"));
		System.out.println(isBalanced(")("));
		System.out.println(isBalanced(""));
		
		
		Queue<String> queue = new LinkedList<>();
		queue.add("Sara");
		queue.add("Omar");
		queue.add("Ali");
		queue.add("Ahmad");
		queue.add("Rayan");

		while (!queue.isEmpty()) {
		    System.out.println("Serving " +queue.poll());   // which method removes and returns the front?
		}
		System.out.println("Queue is empty");
	}
	

}
