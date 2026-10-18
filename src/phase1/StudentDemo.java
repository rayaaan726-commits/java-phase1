package phase1;
import java.util.ArrayList;

public class StudentDemo {
	public static Student findTopStudent(ArrayList<Student> students) {
		Student top = students.get(0);
		for(Student s : students) {
			if (s.getScore() > top.getScore()) {
				top = s;
			}
			
		}
		return top;
	}
	
	public static void main(String [] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student s1 = new Student("Sara" , 92);
		Student s2 = new Student("Omar" , 49);
		Student s3 = new Student("Ali" , 65);
		
		students.add(new Student("Sara", 92));
		students.add(new Student("Omar", 49));
		students.add(new Student("Ali", 65));
		
		Student top = findTopStudent(students);
        System.out.println("Top student: " + top.getName());
		
		s1.toString();
		s2.toString();
		s3.toString();
		
		//System.out.println(s1.name);
		
		
		System.out.println(s1.getGrade());
		System.out.println(s2.getGrade());
		System.out.println(s3.getGrade());
		
		System.out.println(s1.isPassing());
		System.out.println(s2.isPassing());
		System.out.println(s3.isPassing());
		
		
		
		

		for (Student s : students) {
		    s.toString();
		}
		
		Student s = new Student("Sara", 92);
		try {
		    s.setScore(150);
		} catch (IllegalArgumentException e) {
		    System.out.println("Rejected: " + e.getMessage());
		}
		System.out.println(s);    // expected: Sara: 92 (A)
		
		System.out.println("_____________________________________");
		Student s4 = new Student("Ahmad", 55);
		Teacher t1 = new Teacher("Abdullah", "Mathmatics");
		
		System.out.println(s4);
		System.out.println(t1);
	}

	
	

	
}
