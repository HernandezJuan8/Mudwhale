package main;

import graphics.Screen;
import maincharacter.MC;
import load.*;

public class Game implements Runnable{

	private MC maincharacter;
	private Screen GUI;
	private load itemLoad;

	public Game() {
		maincharacter = new MC();
		GUI = new Screen();
		itemLoad = new load();
	}

	public static void main(String[] args) {
		Game master = new Game();
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
