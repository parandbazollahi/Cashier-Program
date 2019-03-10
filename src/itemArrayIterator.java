/**
 *use itterator for item in array
 * @author Parand.bazollahi
 */
public class itemArrayIterator implements ItemIterator {
	StoreItem[] items;
	int position = 0;
 
	public itemArrayIterator(StoreItem[] items) {
		this.items = items;
	}
 
	public StoreItem next() {
		StoreItem storeItem = items[position];
		position = position + 1;
		return storeItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}