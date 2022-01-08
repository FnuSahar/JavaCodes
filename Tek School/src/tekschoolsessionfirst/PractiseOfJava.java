package tekschoolsessionfirst;

public class PractiseOfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Amount =100;
		double shipping= 0;
		double DiscountAmount=0;
		boolean expedited = false;
		
		
		if (Amount<100) {
			//add 5% shipping and no discount
		     shipping=Amount*0.05;
		     DiscountAmount=0;
		}else if (Amount >= 100 && Amount < 300) {
		    // free shipping and 2%discount
			
		     shipping=0;
		     DiscountAmount=Amount*0.02;
		     expedited=false;
		}else if (Amount>=300 && Amount<500) {
			// free shipping and 5% discount
			 shipping=0;
	         DiscountAmount=Amount*0.05;
	         expedited=false;
		}else if(Amount>=500 && Amount < 1000) {
			//expedited shipping and 7% discount
			  DiscountAmount=Amount*0.07;
			  expedited=true;
		}else {
		     //expedited shipping and 10% discount
		      DiscountAmount = Amount*0.07;
		      expedited= true;}
		
		if (expedited=true) {
			System.out.println("expedited shipping");
	}else {
		System.out.println( "Standard Shipping");
	}
		      
		      System.out.println("---------------------");
		      System.out.println("Amount:\t $" + Amount);
		      System.out.println("Shipping:\t +$" + shipping);
		      System.out.println("Discount:\t $" + DiscountAmount);
		      System.out.println("----------------------");
		      System.out.println("Total:\t $" + (Amount+shipping-DiscountAmount));
	    }
	

}
