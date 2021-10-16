package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Background extends JPanel implements ActionListener {

	private Timer timer;
	private MCGFX mcGFX;
	private final int DELAY = 10;

	public Background() {
		initBG();
	}

	private void initBG() {

		addKeyListener(new TAdapter());
		setBackground(Color.BLACK);
		setFocusable(true);

		mcGFX = new MCGFX(40,60);

		timer = new Timer(DELAY, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrawing(g);

		Toolkit.getDefaultToolkit().sync();
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.drawImage(mcGFX.getImage(), mcGFX.getX(), mcGFX.getY(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		step();
	}

	private void step() {

		mcGFX.move();

		repaint(mcGFX.getX() - 1, mcGFX.getY() - 1, mcGFX.getWidth() + 2, mcGFX.getHeight() + 2);
	}

	private class TAdapter extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent e) {
			mcGFX.keyReleased(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			mcGFX.keyPressed(e);
		}
	}

}
