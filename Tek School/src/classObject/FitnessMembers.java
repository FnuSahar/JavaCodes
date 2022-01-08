package classObject;

public class FitnessMembers {
	


	  
	String Name;
	 String Lastname;
	 String Phone;
	 String City;
	 int ID ;
	String SSN;
	 
	
	 public FitnessMembers() { 
	 
	 Name = "";
	 Lastname= "";
	 Phone = "";
	 City = "";
	 ID = 0;
	 SSN ="0";}
	 
	 public FitnessMembers (String Name, String Lastname, String Phone, String City, int ID, String SSN) {
	 
	 this.Name = Name;
	 this.Lastname= Lastname;
	 this.Phone=Phone;
	 this.City = City;
	 this.ID=ID;
	 this.SSN=SSN;}
	 
	 

   @Override
 public String toString () {
	return "Member Name:"+ Name+" "+Lastname+"\nPhone Number: "+Phone +"\nCity: "+ City+"\nID Number: "+ID+"\nSSN Number: "+SSN ;}

}
     
	

