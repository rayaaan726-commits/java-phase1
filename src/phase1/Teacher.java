package phase1;

public class Teacher extends Person{
	protected String subject;

	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", name=" + name + "]";
	}
	
	

	

}
