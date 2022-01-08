package exercises;

public class aaaaa {

	private static String name;
	private static int age;
	int [] names;
	public aaaaa() {
		name="";
		age=0;
		int [] names= new int[5];
		
	}
	public aaaaa(String name, int age) {
	 this.name=name;
	 this.age=age;
	 
	}
	
	public static void fruits() {
		System.out.println("i love fruits");
	}
	
	public static void vegies() {
		System.out.println("i love vegies");
		
	} public static void main(String[] args) {
		
		aaaaa obj1= new aaaaa();
		fruits();
		aaaaa obj2= new aaaaa();
		vegies();
		
		
		
		
		
	}
}
