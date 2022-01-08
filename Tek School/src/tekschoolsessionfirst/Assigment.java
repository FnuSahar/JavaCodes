package tekschoolsessionfirst;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String item ="water";
		double price = 0;
   	    double tax = 0;
   	 
	     if( item == "coke") {
	    	 tax= price*0.05;
	    	 price=2.00;
	         	 
	     }else if (item =="Water") {
	    	 price=3.00;
	    	 tax= price*0.05;
	    	 	
	     }
	     System.out.println("Item: \t \t" + item);
	     System.out.println("Price: \t \t +$"+price);
	     System.out.println("Tax:\t \t +$"+ price*0.05);
	     System.out.println("Totalprice: \t $" + (price +(price*0.05)));

		
		
	}

}
