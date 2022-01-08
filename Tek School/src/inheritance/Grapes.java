package inheritance;

public class Grapes extends Apple{

	private String brand;

    public Grapes() {
	super();
	brand="";
	
	public Grapes(String color, String taste, String smell, double price, String brand) {
		super(color, taste, smell,price)
		this.brand=brand;
		
	}public String getbrand () {
		return brand;
		
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	
	
	
	
	
	
	
	
	
	
	
}}