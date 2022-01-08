package classObject;

import java.util.ArrayList;

public class Device {
	    String ownerName;
		String model;
		String yearBuilt;
		String condition;
		ArrayList<String> listOfApps;
		
		public Device()	{
			
			ownerName="";
			model="";
			yearBuilt="";
			condition="";
			listOfApps = new ArrayList<String>();
		}	
		
		public Device(String newownername, String newmodel, String newyearbuilt, String newcondition, ArrayList<String> newListApps ) {	
			ownerName=newownername;
			model=newmodel;
			yearBuilt=newyearbuilt;
			condition=newcondition;
			listOfApps = newListApps;
		}

			
			
			
		}
	
	
	
	

