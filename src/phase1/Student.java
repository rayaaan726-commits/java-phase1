package phase1;

public class Student extends Person implements Reportable {
	
	
	private int score;
	
	
	public Student(String name, int score) {
		super(name);
		this.name = name;
		 setScore(score); 
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
	    if (score < 0 || score > 100) {
	        throw new IllegalArgumentException("Score must be 0-100, but was " + score);
	    }
	    this.score = score;
	}



	@Override
	public String toString() {
	    return name + ": " + score + " (" + getGrade() + ")";
	}
	
	@Override
    public String getReport() {
        return getName() + " scored " + score + " (" + getGrade() + ")";
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
