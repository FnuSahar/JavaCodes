package tekschoolsessionfirst;

import java.util.ArrayList;

public class ArrayListCityEx {

	public static void main(String[] args) {
		
		
		ArrayList <String> city= new ArrayList<String>();
		
        city.add("DC");
        city.add("VA");
        city.add("CA");
        city.add("TX");
        
        for (int i = 0; i < city.size(); i++) {
			System.out.println(city.get(i));
			}System.out.println("-----------");
			for (String a: city) {
				System.out.println(a);
				
			}System.out.println("-----------");
			for (int j = city.size()-1; j >=1 ; j--) {
				System.out.println(city.get(j));}
				
		System.out.println(city);
	}

}