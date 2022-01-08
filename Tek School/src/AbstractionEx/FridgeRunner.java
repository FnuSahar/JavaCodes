package AbstractionEx;

public class FridgeRunner extends Sumsung2 {

	public static void main(String[] args) {

		Sumsung2 obj = new Sumsung2();
		obj.close();
		obj.open();
		obj.talking();
		obj.touchScreen();
		obj.method1();
		Inter1.method2();
        obj.equals(null);
		System.out.println("---------");
		
		
		obj.setAge(14);
		obj.getAge();
		
		obj.setName("Sahar");
		obj.getName();

	}

}
