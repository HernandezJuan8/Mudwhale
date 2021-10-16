package inventory;

import items.Item;

public class Equipment {
	
	public Item inventory[];
	
	public Equipment() {
		inventory =  new Item[30];
	}
	
	public Item getItem(int index) {
		return inventory[index];
	}
	
	public boolean insertItem(Item item) {
		boolean inserted = false;
		for(int i =0;i<30;i++) {
			if(inventory[i] != null) {
				inventory[i] = item;
				item.setID(i);
				inserted = true;
			}
		}
		return inserted;
	}
	
	public String addItem(Item item) {
		if(insertItem(item)) {
			return "Item stored Sucessfully.";
		}
		return "Inventory Full Item could not be added.";
	}
	
	public boolean deleteItem(Item item) {
		boolean found = false;
		for(int i = 0;i<30;i++) {
			if (inventory[i].getID() == item.getID()){
				inventory[i] = null;
				found = true;
			}
		}
		return found;
	}
	
	public String removeitem(Item item) {
		if(deleteItem(item)) {
			return "Item removed Successfully.";
		}
		
		return "Item could not be found";
	}
}
