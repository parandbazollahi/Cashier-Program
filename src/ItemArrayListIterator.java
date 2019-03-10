/**
 *use iterator pattern for Item array 
 * @author Parand.bazollahi
 */
import java.util.ArrayList;

public class ItemArrayListIterator implements ItemIterator {
	ArrayList<StoreItem> items;
	int position = 0;
 
	public ItemArrayListIterator(ArrayList<StoreItem> items) {
		this.items = items;
	}
 
	public StoreItem next() {
		StoreItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}