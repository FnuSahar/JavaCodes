package inheritance;

public class Apple extends Fruits {

	private double Price;

	public Apple() {
		super();
		Price = 0;

	}

	public Apple(String color, String taste, String smell, double Price) {
		super(color, taste, smell);
		this.Price = Price;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double Price) {
		this.Price = Price;
	}

}
