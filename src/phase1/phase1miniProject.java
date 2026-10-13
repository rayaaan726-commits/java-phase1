package phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class phase1miniProject {
	
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
	
	public static int sum(ArrayList <Integer> list) {
	    int total = 0;
	    for (int i = 0; i < list.size(); i++) {
	        total += list.get(i);   
	    }
	    return total;
	}
	
public static double  average(ArrayList <Integer> list) {
		
		return  (double) sum(list) / list.size();
	}
	
public static int findMax(ArrayList <Integer> list) {
	 int max = list.get(0);
	for (int i = 1; i <list.size(); i++) {
		if (list.get(i) > max) {
			max = list.get(i);
		}
}
	return max;
	
}

	
	
	public static void main(String args []) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> scores = new ArrayList<>();

		System.out.print("How many students? ");
		int count = input.nextInt();
		input.nextLine();   
		
		for (int i = 1; i <= count; i++) {
		    System.out.print("Student " + i + " name: ");
		    String name = input.nextLine();     
		    System.out.print("Student " + i + " score: ");
		    int score = input.nextInt();        
		    input.nextLine();       
		    names.add(name);
		    scores.add(score);        
		}
		//System.out.println(names);
		//System.out.println(scores);
		if (scores.isEmpty()) {
		    System.out.println("No students entered");
		} 
		else {
			
			System.out.println("--- Report ---");
			for (int i = 0; i < names.size(); i++) {
			    System.out.println(names.get(i) + ": " +scores.get(i)+ " (" + grade(scores.get(i)) + ")");
			}
			
			System.out.println("Average: " + average(scores));
			System.out.println("Highest score: " + findMax(scores));
			
			int highest = findMax(scores);
			int position = scores.indexOf(highest);                    
			System.out.println("Top student: " + names.get(position));  
			
		   
		}
		
	}

}
