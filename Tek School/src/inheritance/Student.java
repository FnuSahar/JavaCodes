package inheritance;

public class Student extends Person {

	private double gpa;
	private String major;

	public Student() {
		super();
		this.gpa = 0;
		this.major = "";

	}

	public Student(String firstName, String lastName, int age, double gpa, String major) {
		super(firstName, lastName, age);
		this.gpa = gpa;
		this.major = major;

	}

	public double getgpa() {
		return gpa;
	}

	public void setgpa(double gpa) {
		this.gpa = gpa;
	}

	public String getmajor() {
		return major;
	}

	public void setmajor(String major) {
		this.major = major;

	}

}
