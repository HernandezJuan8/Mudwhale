package graphics;

import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainMenu extends JPanel {

	/**
	 * SVUID.
	 */
	private static final long serialVersionUID = 1L;

	private JLabel title;
	
	private JLabel author;

	private JButton startButton;

	private JButton exitButton;
	
	private Image BG;
	public MainMenu() {
		initMainMenu();
	}

	private void initMainMenu() {
		setBackground(Color.GREEN);
		//BG = Toolkit.getDefaultToolkit().createImage("MainMenuBG.png");
		setLayout(new FlowLayout());
		
		
		setFocusable(true);

		title = new JLabel("Mudwhale");
		title.setHorizontalAlignment(JLabel.CENTER);
	    title.setVerticalAlignment(JLabel.CENTER);
		author = new JLabel("Developed By Juan Hernandez.");
		author.setHorizontalAlignment(JLabel.CENTER);
	    author.setVerticalAlignment(JLabel.CENTER);
		startButton = new JButton("Start!");

		exitButton = new JButton("Exit!");

		add(title);
		add(author);
		add(startButton);
		add(exitButton);
	}
	
	public void paintComponent(Graphics g) {
		//super.paint(g);
		g.drawImage(BG,0,0,null);
	}

}
