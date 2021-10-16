package graphics;
import java.awt.*;
import javax.swing.JFrame;

public class Screen extends JFrame{

	/**
	 * SN
	 */
	private static final long serialVersionUID = 1L;

	public Screen() {
		initGUI();
	}
	
	private void initGUI() {
		add(new MainMenu());
		//add(new Background());
		
		setSize(640,480);
		//pack();
		setResizable(false);
		
		setTitle("Testing GUI");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{ 
			Screen sc = new Screen();
			sc.setVisible(true);
		});

	}

}
