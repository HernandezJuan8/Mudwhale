package mc.mudwhale;

import inventory.mudwhale.Equipment;
import level.mudwhale.Level;

public class MC {

	private String name;
	
	private int HP;
	
	private int attack;
	
	private int defense;
	
	//private int speed;
	
	private double critRate;
	
	//private double accuracy;
	
	private Level level;
	
	private Equipment inventory;
	
	// Current weapon, or current equip
	
	//Armor on class
	
	public MC() {
		name ="";
		HP = 100;
		attack = 5;
		defense = 5;
		critRate = .05;
		level = new Level();
		inventory = new Equipment();
	}
	
	public MC(String name) {
		this.name = name;
		HP = 100;
		attack = 5;
		defense = 5;
		critRate = .05;
		level = new Level();
		inventory = new Equipment();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void incAtt() {
		attack++;
	}
	
	public void incDef() {
		defense++;
	}
	
	public void incAll() {
		incAtt();
		incDef();
	}
	

	
}
