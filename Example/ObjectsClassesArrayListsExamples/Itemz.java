/* Item.java
 * Represents an Item in a shopping cart
 * 
 * Constructor:
 * public Item (String itemName, double itemPrice, int numPurchased)
 * 	-> Create a new item with the given attributes
 * 
 * Methods:
 * public String toString()
 * 	-> return a String with the information about the item
 * 
 * public double getPrice()
 * 	-> returns the unit price of the item
 * public String getName()
 * 	-> returns the name of the item
 * public int getQuantity()
 * 	-> returns the quantity of the item
 */
import java.text.NumberFormat;

public class Itemz {
	private String name;
	private double price;
	private int quantity;
	
	public Itemz (String itemName, double itemPrice, int numPurchased){
		name = itemName;
		price = itemPrice;
		quantity = numPurchased;
	}
	
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
		return (name + "\t\t\t" + fmt.format(price) + "\t\t" + quantity + "\t\t" + fmt.format(price*quantity));
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getQuantity(){
		return quantity;
	}
}