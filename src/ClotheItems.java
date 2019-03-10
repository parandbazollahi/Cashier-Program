/**
 *
 this class use as a Iterator pattern and has a add item like clothe to store Item
 * @author Parand.bazollahi
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ClotheItems implements Item {
	ArrayList<StoreItem> storeItems;
  
	
	public ClotheItems() {
		
		storeItems = new ArrayList<StoreItem>();
	addItem("SWEATSHIRTS",10.99,259);
	addItem("JACKETS",13.79,104);
	addItem("DRESSES", 14.49,370);
	addItem("BLAZERS",8.75,259);
	addItem("JUMPSUITS",21.99,54);
	addItem("SHIRTS", 18.85,592);
	addItem("TOPS",15.99,730);
	addItem("T-SHIRTS",9.25,423);
	addItem("KNITWEAR", 32.99,49);
	addItem("PANTS", 29.99,265);
	addItem("JEANS",24.50,187);
	addItem("SKIRTS",28.49,38);
	addItem("SHORTS", 16.79,71);
	addItem("Wovens",23.99,39);
	addItem("Active",27.50,280);
	addItem("Plus size", 19.99,255);
	addItem("Maternity", 13.99,200);
	addItem("Petite", 20.00,110);
	addItem("Shoes", 190.00,460);
	addItem("Bags", 74.00,297);
	addItem("Jewelery",254.99,320);

	}
	public boolean addItem (String name, double price, int quantity ) {
		StoreItem clothe= new StoreItem(name, price, quantity);
		storeItems.add(clothe);
		return true;
	}
	
	public  ArrayList<StoreItem> getClothingItems() {
		return storeItems;
	}
	public ItemIterator createIterator() {
		return new ClotheItemIterator(storeItems);
	}
}
