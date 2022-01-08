package AbstractionEx;

public interface Inter1 {

	public default void method1() {
		System.out.println(" default keyworld");

	}

	public static void method2() {
		System.out.println(" inter with static");
	}

	public default void open() {
		System.out.println("Opening the Fridge in the interface");

	}
}
