package arrayAndArrayLisst;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList <String > friends = new ArrayList <>();
		friends.add("sahar");
		friends.add("omer");
		friends.add("arsh");
		friends.add("ahmad");
		
		
	for( int i=0; i<friends.size(); i++) {
		System.out.println(friends.get(i));}
		
		int opt = sc.nextInt();
		
		for (int i=0; i<friends.size() ;i++) {
			
			if (i == 0)
				System.out.println("sahar is the mom");
				if (i==1) 
					System.out.println("omer is the dad");
				if (i==2) 
					System.out.println("arsh is the chid");
				break;}
				
				
				System.out.println(sc.nextInt());}
			
		
				
		

}
