package items;

public class ReynoldsSword extends Weapon {

	public ReynoldsSword() {
		setItemType(1);
		setName("Reynold's Old Katana");
		setItemLevel(2);
		setDamage(35);
		setEquip(false);
		setID(2);
		setDesc("This Katana belong to someone named Reynolds.... this oddly shaped sword! "
				+ "It must be from the land to east");
	}
	public ReynoldsSword getReynoldsSword() {
		return this;
	}
}
