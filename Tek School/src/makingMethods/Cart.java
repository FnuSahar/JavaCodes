package makingMethods;

import java.util.ArrayList;

import java.util.Scanner;

public class Cart {

	private ArrayList<Item> items;
	private double salesTaxPercent=7.5/100;
	
	Scanner sc=new Scanner(System.in);
	
	public Cart() {
		this.items=new ArrayList<>();
	}

	// adding item to the cart
	public void addItem(Item item) {
		items.add(item);
		System.out.println("Item Added To The Cart");
	}

	// remove item

	public boolean removeItem() {
		System.out.println("******Removing Item- Please select and option********");
		printCart();
		int selection=0;
		while(!sc.hasNextInt()) {
		  selection=sc.nextInt();
		  if (validOption(selection)) {
			  break;
		  }}

		items.remove(selection-1);
		return true;
	}

	// check out cart
	public void checkOut() {
		System.out.println("****checking out**********");
		printCart();
		double sum=0;
		for (int i = 0; i < items.size(); i++) {
			sum+=(items.get(i).getQuantity()*items.get(i).getPrice());
		}System.out.println("___________________");
		System.out.println("total---------$"+sum);
		System.out.println("Tax-----------$"+ sum*salesTaxPercent);
		System.out.println("Total after Tax----$"+(sum +(sum*salesTaxPercent)));
		System.out.println("thank you for shopping with us");
			
		}
	

	// clear cart
	public boolean clearCart() {
		if(items.size()<1) {
			System.out.println("you have no items in the cart!");
			return false;
		}
		System.out.println("Are you sure you want to remove the item from your cart");
		System.out.println("1, yes");
		System.out.println("2, no ");
		int sel=sc.nextInt();
				if (sel==1) {
					items.clear();
					System.out.println("items Removed!");
					return true;
				}else if (sel== 2) {
					System.out.println("we wont touch the item in the cart");
				}return false;
		
		
	}
	
	// print cart
	public void printCart() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + " " + items.get(i));
		}
	}

	// validate entry

	public boolean validOption(int Sel) {
		if (Sel<= 0) {
			return false;
		}
		
		if (!(Sel >= 1 && Sel <= items.size())) {
			return false;
		}
		return true;
	}

	// change quantity

}
