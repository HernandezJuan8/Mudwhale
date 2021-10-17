package load;

import items.*;

/**
 * Loads all the items and entities in the game.
 * @author Juan Hernandez
 *
 */
public class load {

	private Item itemLoad[];
	public load() {
		itemLoad = new Item[6];
	}
	
	public void generateAllItems() {
		itemLoad[0] = new RustyBroadSword();
		itemLoad[1] = new ReynoldsSword();
		itemLoad[2] = new WestianRapier();
		itemLoad[3] = new Chunchunmaru();
		itemLoad[4] = new Shuusui();
		itemLoad[5] = new EasternArmor();
	}
	
	public Item getItem(int ID) {
		return itemLoad[ID];
	}
}
