package items;

public abstract class Weapon extends Item{

	private int attack;
	
	private boolean equip;
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setEquip(boolean equip) {
		this.equip = equip; 
	}
	
	public int getAttack() {
		return attack;
	}
	
	public boolean isEquipped() {
		return equip;
	}

}
