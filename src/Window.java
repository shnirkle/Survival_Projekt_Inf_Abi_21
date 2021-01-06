import java.awt.Canvas;
import java.awt.Component;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings({ "unused", "serial" })

public class Window extends Canvas {

	


	public Window(Game g, int WinX, int WinY, String title) {
		JFrame frame = new JFrame();
		frame.setTitle(title);
		frame.setBounds(0, 0, WinX, WinY);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(g);
		//frame.add
		
		//setBackground(BLACK);
		
		
		
	}
	
	
	
	
	
	
	
}
