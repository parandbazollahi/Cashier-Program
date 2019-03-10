/**
 * this class use as a Iterator pattern and return a store item 
 * @author Parand.bazollahi
 */
import java.util.ArrayList;

public class ClotheItemIterator implements ItemIterator {
	ArrayList<StoreItem> items;
	int position = 0;
 
	public ClotheItemIterator(ArrayList<StoreItem> items) {
		this.items = items;
	}
 
	public StoreItem next() {
		StoreItem storeItem = items.get(position);
		position = position + 1;
		return storeItem;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}