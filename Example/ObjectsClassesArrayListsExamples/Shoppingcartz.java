/*
 * ShoppingCart.java
 * Represents a shopping cart as an array of items
 * 
 * Constructor:
 * public ShoppingCart()
 * 	-> Creates an empty shopping cart with an initial capacity
 * 
 * Methods:
 * public void addToCart(String itemName, double price, int quantity)
 * 	-> Adds an item to the shopping cart
 * 
 * public String toString()
 * 	-> Returns a summary of the contents of the cart 
 */
import java.text.NumberFormat;
import java.util.ArrayList;

public class Shoppingcartz {
	private int itemCount;			// total number of items in the cart
	private double totalPrice; 		// total price of items in the cart	
	private ArrayList<Itemz> cart;
	
	public Shoppingcartz() {
		itemCount = 0;
		totalPrice = 0.0;
		cart = new ArrayList<Itemz>(0);
	}
	
	public Shoppingcartz(int capacity) {
		itemCount = 0;
		totalPrice = 0.0;
		cart = new ArrayList<Itemz>(capacity);
	}
	
	public void addToCart(String itemName, double price, int quantity){
		cart.add(new Itemz(itemName, price, quantity));
		this.itemCount++;
		this.totalPrice += price*quantity;
	}
	
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String contents = "Shopping Cart\n";
		contents += "\nItem\t\t\t\tUnit Price\tQuantity\tTotal\n";
		
		for (int i = 0; i < itemCount; i++)
			contents += cart.get(i).toString() + "\n";
		
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		
		return contents;
	}
	
	public boolean isEmpty(){
		return cart.size() == 0;
	}
	
}