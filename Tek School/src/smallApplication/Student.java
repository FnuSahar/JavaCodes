package smallApplication;

public class Student {
	
	int rollNo;
	String name;
	static String College="IST";
	
	public Student(int rollNo, String name) {
		this.rollNo= rollNo;
		this.name=name;
		
	}
    static void change() {
	College="BBIT";
}

void display() {
    	System.out.println("Student RollNo: "+ rollNo+ "   Student Name:"+ name+"   College"+ College);
    }
}
	
	
	
