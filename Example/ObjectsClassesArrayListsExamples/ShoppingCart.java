import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Item> cart;
	private double totalCost;
	
	public ShoppingCart() {
		this.cart = new ArrayList<Item>();
		this.totalCost = 0;
	}
	
	public void add(Item i) {
		cart.add(i);
		totalCost += i.getPrice() * i.getQuantity();
	}
	
	public boolean isEmpty() {
		return cart.isEmpty();
	}

	public double getTotalCost() {
		return totalCost;
	}

	public String toString() {
		String result = "Shopping Cart\n";
		result += "Item\t\t\t\tUnitPrice\tQuantity\tTotal\n";
		for(Item i: cart) {
			result += i.toString() + "\n";
		}
		result += "Total Price: $" + this.totalCost;
		return result;
	}
}
