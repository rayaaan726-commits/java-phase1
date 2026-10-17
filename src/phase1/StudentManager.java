package phase1;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	

	
	public static double average(ArrayList<Student> students) {
	    int total = 0;
	    for (Student s : students) {
	        total += s.getScore();   
	    }
	    return (double) total / students.size();
	}
	
	public static Student findTopStudent(ArrayList<Student> students) {
	    Student top = students.get(0);
	    for (Student s : students) {
	        if (s.getScore() > top.getScore()) {
	            top = s;
	        }
	    }
	    return top;
	}
	
	public static void main(String args []) {
	Scanner input = new Scanner (System.in);
	ArrayList<Student> students = new ArrayList<>();
	System.out.print("How many students? ");
	int count = input.nextInt();
	//input.nextLine();
	
	for (int i = 1; i <= count; i++) {
	    System.out.print("Student " + i + " name: ");
	    String name = input.nextLine();
	    System.out.print("Student " + i + " score: ");
	    int score = input.nextInt();
	    input.nextLine();

	    students.add(new Student(name, score));
	}
	
	if (students.isEmpty()) {
	    System.out.println("No students entered");
	} 
	else {
		System.out.println("--- Report ---");
		for (Student s : students) {
		    s.toString();
		}
		System.out.println("Average: " + average(students));
		
		Student top = findTopStudent(students);
		System.out.println("Top student: " + top.getName());		
		
		input.close();
	
	
	}
}
}
