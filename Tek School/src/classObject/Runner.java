package classObject;

import java.util.ArrayList;

public class Runner {
	public static void main (String[]arg) {
		
		ArrayList<String>listofApps=new ArrayList<String>();
		
		
		listofApps.add("facebook");
		listofApps.add("instagram");
		listofApps.add("snapchat");
		listofApps.add("tiktok");
		
	Device obj1= new Device ( "Ahmad", "Iphone 13", "2021","new", listofApps);	
	Device obj2= new Device ( "John", "Iphone 12", "2020","used", listofApps);	
	Device obj3= new Device ( "Alex", "Iphone 10", "2019","new", listofApps);	
	Device obj4= new Device ( "Ali", "Iphone 9", "2018","new", listofApps);
	Device obj5= new Device ( "Max", "Iphone 8", "2017","used", listofApps);
	Device obj6= new Device ( "Sara", "Iphone 7", "2016","new", listofApps);
	Device obj7= new Device ( "Sam", "Iphone 6", "2015","new", listofApps);
	Device obj8= new Device ( "Lilly", "Iphone 5", "2014","used", listofApps);
	Device obj9= new Device ( "Mike", "Iphone 4", "2013","new", listofApps);
	Device obj10= new Device ( "Jeff", "Iphone 3", "2012","new", listofApps);
	System.out.println("Ownername: "+obj1.ownerName + "\n  Model: "+ obj1.model +"\n YearBuilt: "+ obj1.yearBuilt +"\n Condition:"+ obj1.condition+"\n apps: "+obj1.listOfApps);
}
	
	
	}
	
	
	


