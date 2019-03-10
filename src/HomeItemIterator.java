/**
 *use itterator for home item
 * @author Parand.bazollahi
 */
import java.util.ArrayList;

public class HomeItemIterator implements ItemIterator {
	ArrayList<StoreItem> items;
	int position = 0;

	public HomeItemIterator(ArrayList<StoreItem> items) {
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