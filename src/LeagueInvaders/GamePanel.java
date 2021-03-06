package LeagueInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font titleFont2;
	Rocketship rocket;
	ObjectManager manager=new ObjectManager();
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;


	Timer timer;

	GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		titleFont2 = new Font("Arial", Font.PLAIN, 25);
		rocket = new Rocketship(225, 700, 50, 50);
		manager.addObject(rocket);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		
	}

	void updateMenuState() {

	}

	void updateGameState() {
		manager.update();
		manager.manageEnemies();
		rocket.update();
		manager.checkCollision();
		
		if (rocket.isAlive==false) {
			currentState=END_STATE;
			manager.reset();
			rocket = new Rocketship(225, 700, 50, 50);
			manager.addObject(rocket);
		}
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE INVADERS", 26, 200);
		g.setFont(titleFont2);
		g.drawString("Press ENTER to start", 120, 300);
		g.drawString("Press SPACE for instructions", 85, 400);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
		manager.draw(g);
		manager.checkCollision();
		rocket.draw(g);
		if (rocket.isAlive==false) {
			currentState=END_STATE;
		}
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 90, 60);
		String score=Integer.toString(manager.getScore());
		g.drawString(score, 230, 150);
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	void StartGame() {
		timer.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("type");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("press");
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		currentState += 1;
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
	}
		else if (currentState==END_STATE) {
			currentState=MENU_STATE;
		}
		}
	if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		System.out.println("space");
		manager.addObject(new Projectiles(rocket.x,rocket.y, 10, 10));
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		rocket.x-=10;
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		rocket.x+=10;
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("rel");
	}
}
