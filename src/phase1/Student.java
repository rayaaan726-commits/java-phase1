package phase1;

public class Student {
	
	String name;
	int score;
	
	
	public Student(String name, int score) {

		this.name = name;
		this.score = score;
	}
	
	public void printInfo() {
		System.out.println(name +": "+ score +" ("+ getGrade() +")");
	}
	
	// Exercise 9 
	public  String getGrade () {
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
	
	public boolean isPassing() {
		return score >= 51;
	}
	
	

}
