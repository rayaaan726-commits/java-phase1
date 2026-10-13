package phase1;

public class StudentDemo {
	
	public static void main(String [] args) {
		
		Student s1 = new Student("Sara" , 92);
		Student s2 = new Student("Omar" , 49);
		Student s3 = new Student("Ali" , 65);
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		//System.out.println(s1.name);
		
		
		System.out.println(s1.getGrade());
		System.out.println(s2.getGrade());
		System.out.println(s3.getGrade());
		
		System.out.println(s1.isPassing());
		System.out.println(s2.isPassing());
		System.out.println(s3.isPassing());

	}

}
