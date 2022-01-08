package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
			Scanner sc= new Scanner (System.in );
			
			
			int goal=10;
			int enterNum;
			enterNum= sc.nextInt();
			
			while (enterNum!=goal) {
				System.out.println("try again");
				enterNum=sc.nextInt();
			if (enterNum== goal) {
				System.out.println("you guesses the right number");
				break;
			}else {
				System.out.println("you guessed wrong");
			}if (enterNum<goal) {
				System.out.println("go up");
				
			}else {
				System.out.println("go down");
			}
			System.out.println(sc.nextLine());
		
		  
		
	}}}


