package AbstractionEx;

public abstract class Fridge {
	private String name;
	private int age;

	public Fridge() {
		name = "";
		age = 0;
	}

	public Fridge(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void open() {
		System.out.println("Opening the Fridge in class");
	}

	public void close() {
		System.out.println("closing the fridge");
	}

	public abstract void talking();

	public abstract void touchScreen();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public interface AccountGeneralMethods {

	public boolean withdrwa(double amount);
	public boolean deposit(double amount);

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
