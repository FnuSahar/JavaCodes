package makingMethods;

public class Customer extends Item {
	private String FirstName;
	private String LastName;
	private int Age;
	private int PhoneNumber;
	private Cart cart;
	static int Count = 0;

	public Customer() {
		super();
		this.FirstName = "";
		this.LastName = "";
		this.Age = 0;
		this.PhoneNumber = 0;
		this.cart=new Cart();
		
		Count++;
	}

	public Customer(String FirsName, String LastName, int Age, int PhoneNumber) {
		this();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		this.PhoneNumber = PhoneNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public static int getCount() {
		return Count;
	}

	public static void setCount(int count) {
		Count = count;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return FirstName + LastName + Age + PhoneNumber;

	}

}
