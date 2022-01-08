package tekschoolsessionfirst;

import java.util.ArrayList;

public class FruitsExampleArryList {
	//TODO Auto-generated method stub

	public static void main(String[] args) {
		

		ArrayList <String> States= new ArrayList <String>();
		States.add("DC");
		States.add("VA");
		States.add("CA");
		States.add("TX");
		
				for (int i=0; i<States.size(); i++) {
					System.out.println(States.get(i));
				}
				System.out.println("------");
				
				for (int i=States.size()-1;i>=0;i--) {
					System.out.println(States.get(i));}
				System.out.println("------");	
					for(String i :States) { 
						System.out.println(i);
					
				
				}
					System.out.println("------");
					System.out.print(States);
				
				
					
					
				
				
				
			
				
				
		
		
		
		
		
	}

	}
