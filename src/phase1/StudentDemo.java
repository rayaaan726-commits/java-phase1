package phase1;
import java.util.ArrayList;
import java.util.HashMap;


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
		Teacher t1 = new Teacher("Abdullah", "Mathematics");
		
		System.out.println(s4);
		System.out.println(t1);
		
		ArrayList<Reportable> items = new ArrayList<>();
		items.add(new Student("Sara", 92));
		items.add(new Teacher("Abdullah", "Mathematics"));
		items.add(new Course("Java", 40));

		for (Reportable r : items) {
		    System.out.println(r.getReport());
		}
		
		// HashMap
		

		HashMap<String, Integer> ages = new HashMap<>();

		ages.put("Sara", 22);                    // add
		ages.put("Omar", 25);
		ages.put("Ali", 19);

		System.out.println(ages.get("Omar"));    // 25
		System.out.println(ages.size());         // 3
		System.out.println(ages.containsKey("Ali"));   // true
		ages.put("Omar", 26);                    // same key: replaces the old value
		ages.remove("Ali");                      // remove by key
		System.out.println(ages);           // e.g. {Sara=22, Omar=26}
		System.out.println("______________________________________");
		
		for (String name : ages.keySet()) {
		    System.out.println(name + " is " + ages.get(name));
		}
	}
     
	
	

	
}
