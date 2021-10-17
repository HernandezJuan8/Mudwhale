package items;

public class RustyBroadSword extends Weapon {
	
	public RustyBroadSword() {
		setItemType(1);
		setName("Rusty Broad Sword");
		setItemLevel(1);
		setDamage(25);
		setEquip(false);
		setID(1);
		setDesc("This Rusty Broad sword is pretty blunt and a bit green..... kinda weird.");
	}

	public RustyBroadSword getRustyBroadSword() {
		return this;
	}
}
