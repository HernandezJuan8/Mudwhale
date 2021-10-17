package items;

public abstract class Armor extends Item {
	
	private int defense;
	
	private boolean equip;
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void setEquip(boolean equip) {
		this.equip = equip;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public boolean isEquipped() {
		return equip;
	}

}
