package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner1 {

	public static void main(String[] args) {

		ArrayList<Item> Cart = new ArrayList<>();// create list to store for the items which will be in the cart
		// list of available items
		ArrayList<Item> availableItems = new ArrayList<>();
		availableItems.add(new Item(" History", 1.99, 3));
		availableItems.add(new Item("Dari", 2.99, 4));
		availableItems.add(new Item("English", 3.99, 5));

		// create scanner
		Scanner sc = new Scanner(System.in);
		//creating a checkout flag, to know if use whats to checkout, is selected stop asking user to select opt, if checkout is selected print the cart
		boolean checkout= false;
		while (!checkout) {// or checkout==false
			int LastLine=0;
			System.out.println("Please choose your Items");

			// print list of options
			for (int i = 0; i < availableItems.size(); i++) {
				// add 1 with i and print the i, use tostring for format
				
				System.out.println((i + 1) + " " + availableItems.get(i));
				LastLine= i+2;
			}System.out.println(LastLine +" Checkout"); //instead of lastline you can also put availableitemss.serze()+1

			
			int opt = sc.nextInt();// next line in the scanner you expect an integer, its name is opt
			if (opt == LastLine) {
				checkout=true;
				break;//stop and get out loop because user selected checkout which is lastline
			}
			System.out.println("choose number of item");
			int num = sc.nextInt();// next line in the scanner will be expect integer, its name is num
			System.out.println("Items added to the cart" + opt + "   num" + num); 
			// adding item to the cart
			Cart.add(new Item(availableItems.get(opt-1).getBook(),availableItems.get(opt-1).getPrice(), num));
			
			//end of loop that selected option to add in the cart
		}
		
		System.out.println("*******Printing Cart*******");
		double GrandTotal=0;
		for (int i=0; i<Cart.size(); i++) {
			double sum= Cart.get(i).getPrice()* Cart.get(i).getNum();
			System.out.println((i+1)+ ","+ Cart.get(i)+"-----$"+ sum);
			GrandTotal+=sum;
		}
		System.out.println("----------------");
		System.out.println("GrandTotal\t\t\t$"+GrandTotal);
		
		
		
		
		
		

	}
}
