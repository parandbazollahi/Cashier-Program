/**
 *
 this class use as a Iterator pattern and has a add item like home to store Item
 * @author Parand.bazollahi
 */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;

public class HomeItem implements Item {
	ArrayList<StoreItem> storeItems;
	
	public HomeItem() {
		storeItems = new ArrayList<StoreItem>();
		addItem("Furniture",150.50,35);
		addItem("Bath",9.25,131);
		addItem("Bedding", 13.99,25);
		addItem("Curtains",17.75,56);
		addItem("Home Decor",11.75,193);
		addItem("kids & baby room", 16.65,26);
		addItem("kitchen",55.99,21);
		addItem("Lighting",59.99,23);
		addItem("Office & Storage", 13.25,14);
		addItem("Outdoor", 12.99,19);
		addItem("Pet",36.99,175);
		addItem("Rugs",71.99,42);
		addItem("Pillows", 6.99,81);
		addItem("Picture Frame",43.25,27);
		addItem("Candles",8.75,332);
		
	}
	public void addItem (String name, double price, int quantity ) {
		StoreItem home= new StoreItem(name, price, quantity);
		storeItems.add(home);
	}
	
	public ArrayList<StoreItem> getHomesItems() {
		return storeItems;
	}
	public ItemIterator createIterator() {
		return new HomeItemIterator(storeItems);
	}
	public String toString() {
		return " Home Items";
	}
}
