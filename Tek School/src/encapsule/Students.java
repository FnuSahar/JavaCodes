package encapsule;

 public class Students {
	
	 private String name;
	 private String lname;
	 int age;
	 
	 public Students() {
		 
		 String name= "";
		 String lname="";
		 int age=0;
		 
	}public Students(String name, int age ){
	
	this.name= "name";
	this.age= age;
	
	 
	 
	}public Students (String name, String lname, int age){
		this.name=name;
		this.lname=lname;
		this.age= age;
	}
	
	public String toString () {
		return "Name:" + name +"\nLname:" +lname+ "\nAge:"+ age;
	}

	
	
			
			
		
	
 }
 
	 
 


