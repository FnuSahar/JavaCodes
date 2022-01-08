package exercises;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {

		int CurrentYear = 2021;

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Age Calculator");
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Please enter the year you were born");
		int year = sc.nextInt();
		System.out.println("Thank you" + " "+ name + " your age is " + (CurrentYear - year));

	}

}
