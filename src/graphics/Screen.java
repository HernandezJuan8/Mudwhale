package graphics;
import java.awt.*;
import javax.swing.JFrame;

public class Screen {
	
	private GraphicsDevice vc;
	
	public Screen() {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice();
	}
	
	public void setFullScreen(DisplayMode dm,JFrame window){
		window.setUndecorated(true);
		window.setResizable(false);
		vc.setFullScreenWindow(window);
	}
}
