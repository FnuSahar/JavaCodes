package makingMethods;

public class Item {

	private String Name;
	private double Price;
	private int quantity;

	public Item() {
		Name = "";
		Price = 0;
		quantity = 0;
	}

	public Item(String Name, double Price, int quantity) {
		super();
		this.Name = Name;
		this.Price = Price;
		this.quantity = quantity;

	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double Price) {
		this.Price = Price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
@Override 
	public String toString() {
		return "Name: " + Name + "Price: $" + Price + "qty: " + quantity;
	}

}
