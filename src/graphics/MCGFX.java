package graphics;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * graphics for main character.
 * 
 * @author Juan Hernandez
 *
 */
public class MCGFX extends Sprite {

	private int dx;
	private int dy;
	private Image image;

	public MCGFX(int x, int y) {
		super(x,y);
		initMCGFX();
	}

	private void initMCGFX() {
		loadImage("C:/Users/herna/Desktop/Game1/src/graphics/character.png");
		getImageDimensions();
	}

	public void move() {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {

		return width;
	}

	public int getHeight() {

		return height;
	}

	public Image getImage() {

		return image;
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_E) {
			dx = -2;
		}

		if (key == KeyEvent.VK_D) {
			dx = 2;
		}

		if (key == KeyEvent.VK_W) {
			dy = -2;
		}

		if (key == KeyEvent.VK_S) {
			dy = 2;
		}
	}

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_A) {
			dx = 0;
		}

		if (key == KeyEvent.VK_D) {
			dx = 0;
		}

		if (key == KeyEvent.VK_W) {
			dy = 0;
		}

		if (key == KeyEvent.VK_S) {
			dy = 0;
		}
	}
}
