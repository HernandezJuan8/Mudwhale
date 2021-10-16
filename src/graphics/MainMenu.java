package graphics;

import java.awt.*;
import javax.swing.*;

public class MainMenu extends JPanel {

	private JLabel title;

	private JButton startButton;

	private JButton exitButton;

	public MainMenu() {
		initMainMenu();
	}

	private void initMainMenu() {
		setLayout(new FlowLayout());
		
		setBackground(Color.WHITE);
		setFocusable(true);

		title = new JLabel("testing Menu!");

		startButton = new JButton("Start!");

		exitButton = new JButton("Exit!");

		add(title);
		add(startButton);
		add(exitButton);
	}

}
