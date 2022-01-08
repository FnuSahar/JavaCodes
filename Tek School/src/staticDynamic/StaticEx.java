package staticDynamic;

public class StaticEx {

	public static void main(String[] args) {

		Student obj1 = new Student();
        obj1.name = "Jack";
		Student obj2 = new Student();
        obj2.name = "Jack";

		System.out.println(Student.count);

	}

}
