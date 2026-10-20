package phase1;

public class Course implements Reportable{
	protected String title;
	protected int hours;
	
	
	
	public Course(String title, int hours) {
		super();
		this.title = title;
		this.hours = hours;
	}

	

	public String getTitle() {
		return title;
	}



	public int getHours() {
		return hours;
	}



	@Override
    public String getReport() {
        return "Course "+getTitle() + "(" + getHours()+" Hours)";
    }
}

