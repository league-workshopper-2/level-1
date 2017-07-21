package DoodleJump;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import LeagueInvaders.Rocketship;



public class DoodlePanel extends JPanel implements KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font titleFont2;
	Doodle doodle;
	DoodleManager manager=new DoodleManager();
	public static BufferedImage PlatformImg;
	public static BufferedImage DoodlerImg;
	Timer timer;
	GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		titleFont2 = new Font("Arial", Font.PLAIN, 25);
		doodle = new Doodle(225, 700, 50, 50);
		manager.addObject(doodle);
		try {
			PlatformImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			DoodlerImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}
	public void StartGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
