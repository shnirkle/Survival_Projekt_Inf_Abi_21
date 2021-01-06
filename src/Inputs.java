import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Inputs {
	private int x = 0;
	private int y = 0;
	Inputs() {
		
		
		
	}
	
	public int get_dx() {
		return x;
	}
	public int get_dy() {
		return y;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keypressed");
		int key = e.getKeyCode();

		
		// return null;
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyreleased");
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			// return("0");
		}

		if (key == KeyEvent.VK_RIGHT) {
			// return("0");
		}

		if (key == KeyEvent.VK_UP) {
			// return("0");
		}

		if (key == KeyEvent.VK_DOWN) {
			// return("0");
		}
		// return null;

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
