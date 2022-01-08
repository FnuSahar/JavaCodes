package StaticKeyword;

public class Runner {

	public static void main(String[] args) {

		Emp Ahmad = new Emp();
		Ahmad.eid = 1;
		Ahmad.salary = 4000;
		Ahmad.ceo = "Ali";

		Emp Mohammad = new Emp();
		Mohammad.eid = 2;
		Mohammad.salary = 5000;
		Mohammad.ceo = "Ali";

		Emp.ceo = " Mahesh";

		Ahmad.show();
		Mohammad.show();
		
	}

}
