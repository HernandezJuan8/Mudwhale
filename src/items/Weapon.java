package items;

public abstract class Weapon extends Item{

	private int damage;
	
	private boolean equip;
	
	public void setDamage(int attack) {
		this.damage = attack;
	}
	
	public void setEquip(boolean equip) {
		this.equip = equip; 
	}
	
	public int getDamage() {
		return damage;
	}
	
	public boolean isEquipped() {
		return equip;
	}

}
