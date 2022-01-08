package smallApplication;

public class RunnerCopy {
	
	
	
	boolean checkOut = false; while (checkOut == false) { // this <<< can be said as !checkOut
	// keep asking user to add items to the cart // print a list of options
	System.out.println("Please choose one of the following items:");
	for (int i = 0; i < availableItems.size(); i++) {
	System.out.println((i + 1) + ", " + availableItems.get(i));
	}
	int chkOutLineNum = (availableItems.size() + 1);
	System.out.println(chkOutLineNum + ", CheckOut"); int opt = sc.nextInt(); // user selected the checkout option
	if (opt == chkOutLineNum) {
	checkOut = true; // set the flag for the loop to true
	System.out.println("Checking Out!");
	break; // stop and get out of the loop
	// we do not want to keep asking user to select options anymore
	}
	System.out.print("Please enter the quantity you want: ");
	int qty = sc.nextInt();
	System.out.println("\n*\nItem Added to the Cart!\n*\n"); // adding item to the cart
	cart.add(new Item(availableItems.get(opt - 1).getName(), availableItems.get(opt - 1).getPrice(), qty)); } // <<<< this is end of the loop that selects options to add to cart 
	// user selected checked out, lets do the following
	// print the cart
	System.out.println("***************** Printing the Cart *****************");
	double grdTotal = 0;
	for (int i = 0; i < cart.size(); i++) {
	double sum = cart.get(i).getPrice() * cart.get(i).getQuantity();
	System.out.println((i+1) + ", " + cart.get(i) + " ---- $" + sum);
	grdTotal += sum;
	}
	System.out.println("---------------------");
	System.out.println("Grand Total \t\t\t $" + grdTotal);
	}
	} (edited) 

}
