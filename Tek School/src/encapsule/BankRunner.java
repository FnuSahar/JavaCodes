package encapsule;

public class BankRunner {

	public static void main(String[] args) {

		BankAccount customer1 = new BankAccount(12345, "Jack", "Label", "10/01/1990");

		System.out.println(customer1.getAccountNumber());

		customer1.setAccountNumnber(67890);

		System.out.println(customer1.getAccountNumber());
		System.out.println(customer1.getlastName());

		customer1.setFirstName("ahmad");
		System.out.println(customer1.getFirstName());
		System.out.println(customer1.getbalance());
		customer1.deposit(199.00);
		customer1.deposit(10.00);
		customer1.withdraw(300.00);
		System.out.println(customer1.getbalance());
	}

}
