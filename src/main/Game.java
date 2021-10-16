package main;

import graphics.Screen;
import maincharacter.MC;

public class Game implements Runnable{

	private MC maincharacter;
	private Screen GUI;

	public Game() {
		maincharacter = null;
		GUI =  null;
	}

	public static void main(String[] args) {
		Game master = new Game();
	
		master.maincharacter = new MC();
		master.GUI = new Screen();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
