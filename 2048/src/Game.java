import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;


public class Game {
	
	//Constructor
	public Game(int width, int height) throws IOException, InterruptedException{

		//boolean running = true;
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(width, height);
		go.setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		go.setLocation(screenSize.width/2 - (width/2), screenSize.height/2 - (height/2));
		
		
	
	
	}
	
	public static Dimension getSize()
	{
		return new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	}

}
