package inheritance;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {

		firstName = "";
		lastName = "";
		age = 0;
	}

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "FirstName:" + firstName + ", LastName:" + lastName + ", Age:" + age;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastname() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

}
