package exercises;

public class Item {

	private String book;
	private double price;
	private int num;

	public Item() {
		this.book = "";
		this.price = 0;
		this.num = 0;
	}

	public Item(String book, double price, int num) {
		super();
		this.book = book;
		this.price = price;
		this.num = num;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;

	}

	public String toString() {
		return  book +"  "+ price + "  "+ num;

	}

}
