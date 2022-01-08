package smallApplication;

public class StudentRunner {

	public static void main(String[] args) {

		Student student1 = new Student(1, "ahmad");
		student1.display();
		Student student2 = new Student(2, "ali  ");
		student2.display();
		Student student3 = new Student(3, "john ");
		student3.display();
		Student student4 = new Student(4, "mike ");
		student4.display();
		
		

		Student.change();
		Student student5 = new Student(5, "sara ");
		student5.display();
	}

}
