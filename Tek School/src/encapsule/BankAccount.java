package encapsule;

public class BankAccount {
	private int accountNumber;
	private String firstName;
	private String lastName;
	private String dob;
	private double balance;

	public BankAccount() {
		accountNumber = 0;
		firstName = "";
		lastName = "";
		dob = "";
		balance = 0;
	}

	public BankAccount(int accountNumber, String firstName, String lastName, String dob) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.balance = 0;
	}

	public int getAccountNumber() {
		return accountNumber;

	}

	public void setAccountNumnber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getlastName() {
		return lastName;

	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
		// making this custom method based on the requirement
		// goind to return the new balance
		// add the amout to the custom accont balance
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	// going to withdraw the balance after withdraw is done
	// this method is goint to deduct the amount given by the method from the
	// balance

	public double withdraw(double amount) {
		if (amount > balance) {
			System.out.println("you dont have enought money");
			System.out.println("transaction failed");
			return balance;
		} else {
			balance = balance - amount;
			System.out.println("you withdraw" + balance);
			System.out.println("transaction successfully");
		}

		return balance;

	}
}
