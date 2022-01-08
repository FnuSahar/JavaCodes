package AbstractionEx;

public class Runner {

	public static void main(String[] args) {
		
		Iphone obj= new Iphone();
		Sumsung obj1= new Sumsung();
		show(obj);
		show(obj1);
		obj.showConfig();
		obj1.showConfig();
		}

	public static void show(Phone obj){
		obj.showConfig();
	

	}}

	
