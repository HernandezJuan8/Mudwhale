package items;

public abstract class Item {
	
	
	/**
	 * Item type.
	 * itemType = 1 then it is a weapon
	 * itemType = 2 then it is a piece of armor
	 * itemTpe = 3 then it is a non wearable item
	 */
	private int itemType;
	
	/**
	 * Name of the item
	 */
	private String itemName;
	
	/**
	 * Level of item ranging from 1-5.
	 * 1 being worst
	 * 5 being best.
	 */
	private int itemLevel;
	
	/**
	 * ID of the item.
	 */
	private int ID;
	
	/**
	 * Description of item.
	 */
	private String desc;
	
	public void setName(String name) {
		this.itemName = name;
	}
	
	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	
	public void setItemType(int itemType) {
		this.itemType = itemType;
	}
	
	public int getItemType() {
		return itemType;
	}
	
	public String getitemName() {
		return itemName;
	}
	
	public int getitemLevel() {
		return itemLevel;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
