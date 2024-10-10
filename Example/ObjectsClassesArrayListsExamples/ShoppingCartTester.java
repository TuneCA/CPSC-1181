
public class ShoppingCartTester {

	public static void main(String[] args) {
		ShoppingCart walmartCart = new ShoppingCart();
		walmartCart.add(new Item("Lindt Chocolate", 4.99, 3));
		walmartCart.add(new Item("Glasses Wipes", 2.50, 4));
		walmartCart.add(new Item("Green Apples", 0.21, 12));
		System.out.println(walmartCart.toString());
	}

}
