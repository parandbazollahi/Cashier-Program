/**
 * use Iterator pattern for item in the list and get the name, price and quantity
 * @author Parand.bazollahi
 */
public class StoreItem {
	String name;
	double price;
	int quantity;

	public StoreItem(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}