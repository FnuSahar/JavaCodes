package smallApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Items> Cart = new ArrayList<>();
		ArrayList<Items> availableItems = new ArrayList<>(); // make ArrayList of items
		availableItems.add(new Items("Book", 2.99, 10));
		availableItems.add(new Items("Computer", 10.99, 20));
		availableItems.add(new Items("Redbull", 1.99, 30));
		availableItems.add(new Items("Pen", 0.99, 8));

		Scanner sc = new Scanner(System.in); // made a scanner to get access to console

		boolean Checkout = false;
		while (!Checkout) {
			System.out.println("Please choose your item");
			for (int i = 0; i < availableItems.size(); i++) {
				System.out.println((i + 1) + " " + availableItems.get(i));
			} // get items
			int ChekOutLineNum = (availableItems.size() + 1);
			System.out.println(ChekOutLineNum + " Checkout");
			int opt = sc.nextInt();
			if (opt == ChekOutLineNum) {
				Checkout = true;

				for (Items i : Cart) {
					for (Items item : availableItems) {
						if (i.getName().equals(item.getName())) {
							item.setQty(opt);
						}
					}
				}       
				break;
			}
			System.out.println("Please Select Quantity");
			int qty = sc.nextInt();

			System.out.println("Item added to the cart");
			Cart.add(new Items(availableItems.get(opt - 1).getName(), availableItems.get(opt - 1).getPrice(), qty));
		}
		System.out.println("*****Printing Cart*********");
		double GrandTotal = 0;
		for (int i = 0; i < Cart.size(); i++) {
			double sum = Cart.get(i).getPrice() * Cart.get(i).getQty();
			System.out.println((i + 1) + " " + Cart.get(i) + "----$" + sum);
			GrandTotal += sum;
			System.out.println("GrandTotal" + GrandTotal);
		}

	}
}