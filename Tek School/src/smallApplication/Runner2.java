package smallApplication;

import java.util.ArrayList;
import java.util.Scanner;

import exercises.Item;

public class Runner2 {

	public static void main(String[] args) {
		ArrayList<Item> Cart = new ArrayList<>();
		
		//1st make the list of items
		
		ArrayList <Item> availableItems= new ArrayList<> ();
		availableItems.add(new Item("Dari", 1.25, 3));
		availableItems.add(new Item("Pashto",2.50, 5));
		availableItems.add(new Item("Englsih", 4.40,10));
		// create the scanner
		Scanner sc = new Scanner(System.in);
		
		boolean checkout= false;
		
		while(!checkout) {
			
			int Lastline=0;
			// create opt with for loop
			System.out.println("choose the option of the item");
			for (int i =0; i< availableItems.size(); i++){
				
				
				System.out.println((i+1) +" "+ availableItems.get(i));
				Lastline= i+2;
		}  System.out.println(Lastline + " Checkout ");
			int opt= sc.nextInt();
			if (opt == Lastline) {
				checkout=true;
				break;
			}
		    System.out.println("choose the Number");
		    int Num= sc.nextInt();
		    System.out.println(" you have added this item to cart  " + availableItems.get(opt-1).getNum() +" "+ Num );
		  Cart.add(new Item(availableItems.get(opt-1).getBook(), availableItems.get(opt-1).getPrice(), Num));  	
		}
		System.out.println("*************printing cart***********");
		double GrandTotal=0;
		for(int i=0; i<Cart.size(); i++) {
			
			double sum= Cart.get(i).getNum()* Cart.get(i).getPrice();
			System.out.println((i+1) + ", " + Cart.get(i) + " ---- $" + sum);
			GrandTotal += sum;
			
		}System.out.println("_________________________");
		System.out.println("GrandTotal:     "+ GrandTotal);
		
		
		
	    
			

	}}
