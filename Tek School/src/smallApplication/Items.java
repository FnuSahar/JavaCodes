package smallApplication;

public class Items {

	private String name;
	private double price;
	private int qty;

	public Items() {
		name = "";
		price = 0;
		qty = 0;

	}

	public Items(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

    public void setQty(int qty) {
	    this.qty=qty;
    }
    public String toString() {
    	return "Name: "+ name + "__Price: "+ price + "__Quantity: "+ qty ; }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
