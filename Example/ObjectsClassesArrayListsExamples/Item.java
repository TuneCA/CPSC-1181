import java.text.NumberFormat;

public class Item {
	private String name;
	private double price;
	private int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;		
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		//found at https://docs.oracle.com/javase/tutorial/i18n/format/numberFormat.html
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String result = this.name + "\t\t\t";
		result += fmt.format(this.price) + "\t\t";
		result += this.quantity + "\t\t";
		result += fmt.format(this.quantity * this.price);
		return result;
	}

}
