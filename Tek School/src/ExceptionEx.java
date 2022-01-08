import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			String[] pets = { "dog", "Cat", "horse" };
			System.out.println(pets[4]);
		} catch (Exception e) {
			System.out.println("an exception happened");
		}

		try {

			int i = 0;

			int j = 30;
			System.out.println(i % j);
		} finally {
			System.out.println("ignore exceptions");
		}
		try {

			System.out.println("what is your favourite number");

			int n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("nothing");

		}
		try {
		String[]pet= {"dog"};
		System.out.println(pet[1]);}
		catch(NullPointerException e) {
			System.out.println("your array is null");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index out of Bound");
		}catch(Exception e) {
			System.out.println("ignore this exception");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
