package inheritance;

public class Fruits {

	private String color; // dec our variables
	private String taste;
	private String smell;
	
	
	public Fruits() { // default constructor
		color="";
		taste="";
		smell="";
		}
	public Fruits (String color, String taste, String smell) {
		this.color=color;
		this.taste=taste;
		this.smell=smell;
	}
	public String toString() {
		return "Color:" +color+"/nTaste:"+ taste+ "/nSmell:"+ smell;
	}
	public String getColor() {
		return color;
	}public void setColor(String color) {
		this.color=color;
	}public String getTaste() {
		return taste;
	}public void setTaste(String taste) {
		this.taste=taste;
	}public String getSmell() {
		return smell;
	}public void setSmell(String smell) {
	    this.smell=smell;
	
	
	
}}
