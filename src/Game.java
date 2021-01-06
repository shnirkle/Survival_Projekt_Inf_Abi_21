import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Game extends JPanel implements Runnable, KeyListener {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private static final long serialVersionUID = 1L;
	private int l;
	private int r;
	private int u;
	private int d;

	private BufferedImage image;

	private final int zielFrames = 60;
	private final int zielZeit = 1000 / zielFrames;
	
	BufferedImage img1;

	// private int playerX;
	// private int playerY;

	// private Thread thread;
	// private boolean isRunning;

	public Game() {
		addKeyListener(this);
		Window frame = new Window(this, 600, 600, "survival");
		setFocusable(true);
		// Graphics2D d = new Graphics2D();
		run();

	}

	public BufferedImage loadImage(String path) {
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException ex) {
			System.out.println(path + " couldn't be loaded :(");
			return null;
		}

		return image;
	}

	public static void main(String[] args) {
		Game main = new Game();

	}

	public void run() {
		init();

		while (true) {

			x += -1 * l + r;
			y += -1 * u + d;
			this.paintImage(this,  img1);
			//System.out.println("X:" + x + "  Y:" + y);
			
			try {
				Thread.sleep(zielZeit);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

	private void init() {
		img1 = loadImage("file:///D:/L/Survival/Survival/assets/test.png");

	}

	private void paintImage(Graphics g, BufferedImage image) {
		super.paintComponent(g);
		g.drawImage(image, x, y, this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			System.out.println("L");
			l = 1;
		}

		if (key == KeyEvent.VK_RIGHT) {
			System.out.println("R");
			r = 1;
		}

		if (key == KeyEvent.VK_UP) {
			System.out.println("U");
			u = 1;
		}

		if (key == KeyEvent.VK_DOWN) {
			System.out.println("D");
			d = 1;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			System.out.println("L");
			l = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			System.out.println("R");
			r = 0;
		}

		if (key == KeyEvent.VK_UP) {
			System.out.println("U");
			u = 0;
		}

		if (key == KeyEvent.VK_DOWN) {
			System.out.println("D");
			d = 0;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
