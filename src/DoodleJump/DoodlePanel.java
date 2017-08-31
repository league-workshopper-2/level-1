package DoodleJump;

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
import javax.swing.JPanel;
import javax.swing.Timer;

import LeagueInvaders.ObjectManager;
import LeagueInvaders.Projectiles;
import LeagueInvaders.Rocketship;


public class DoodlePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font titleFont2;
	Doodler doodle;
	DoodleManager manager=new DoodleManager();
	Timer timer;
	static BufferedImage background;
	static BufferedImage doodler;
	static BufferedImage platform;
	static BufferedImage bullet;
	static BufferedImage paper;
public DoodlePanel() {
	timer=new Timer(1000/60, this);
	titleFont = new Font("Arial", Font.PLAIN, 48);
	titleFont2 = new Font("Arial", Font.PLAIN, 25);
	doodle = new Doodler(225, 250, 100, 149);
	manager.addObject(doodle);
	try {
		background=ImageIO.read(this.getClass().getResourceAsStream("background.png"));
		doodler=ImageIO.read(this.getClass().getResourceAsStream("toilet.png"));
		platform=ImageIO.read(this.getClass().getResourceAsStream("Platform.png"));
		bullet=ImageIO.read(this.getClass().getResourceAsStream("poop.png"));
		paper=ImageIO.read(this.getClass().getResourceAsStream("paper.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void updateMenuState(){
	
}
void updateGameState(){
manager.update();
manager.manageEnemies();
doodle.update();
manager.checkCollision();
if (doodle.isAlive==false) {
	currentState=END_STATE;
	manager.reset();
	doodle = new Doodler(225, 700, 50, 50);
	manager.addObject(doodle);
}
}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.drawImage(background, 0, 0, DoodleJump.width,DoodleJump.height,null);
	g.drawImage(doodler, 190, 500, 100,100,null);
	g.drawImage(platform, 190, 590, 100,20,null);
	g.drawImage(paper, 20, 50, 20,21,null);
	g.drawImage(paper, 80, 50, 20,21,null);
	g.drawImage(paper, 140, 50, 20,21,null);
	g.drawImage(paper, 10, 100, 20,21,null);
	g.drawImage(paper, 70, 120, 20,21,null);
	g.drawImage(paper, 130, 160, 20,21,null);
	g.drawImage(paper, 5, 190, 20,21,null);
	g.drawImage(paper, 65, 220, 20,21,null);
	g.drawImage(paper, 125, 250, 20,21,null);
	g.drawImage(paper, 185, 300, 20,21,null);
	g.drawImage(paper, 200, 300, 20,21,null);
	g.drawImage(paper, 80, 300, 20,21,null);
	g.drawImage(paper, 140, 400, 20,21,null);
	g.drawImage(paper, 10, 360, 20,21,null);
	g.drawImage(paper, 70, 370, 20,21,null);
	g.drawImage(paper, 130,420, 20,21,null);
	g.drawImage(paper, 5, 480, 20,21,null);
	g.drawImage(paper, 65, 320, 20,21,null);
	g.drawImage(paper, 125, 340, 20,21,null);
	g.drawImage(paper, 185, 290, 20,21,null);
	g.drawImage(paper, 20, 500, 20,21,null);
	g.drawImage(paper, 80, 520, 20,21,null);
	g.drawImage(paper, 140, 530, 20,21,null);
	g.drawImage(paper, 10, 480, 20,21,null);
	g.drawImage(paper, 70, 550, 20,21,null);
	g.drawImage(paper, 130, 600, 20,21,null);
	g.drawImage(paper, 5, 580, 20,21,null);
	g.drawImage(paper, 65, 520, 20,21,null);
	g.drawImage(paper, 125, 450, 20,21,null);
	g.drawImage(paper, 185, 530, 20,21,null);
	g.drawImage(paper, 20, 600, 20,21,null);
	g.drawImage(paper, 80, 650, 20,21,null);
	g.drawImage(paper, 140, 620, 20,21,null);
	g.drawImage(paper, 10, 680, 20,21,null);
	g.drawImage(paper, 70, 690, 20,21,null);
	g.drawImage(paper, 130, 700, 20,21,null);
	g.drawImage(paper, 5, 690, 20,21,null);
	g.drawImage(paper, 65, 720, 20,21,null);
	g.drawImage(paper, 125, 750, 20,21,null);
	g.drawImage(paper, 185, 700, 20,21,null);
	g.drawImage(bullet, 500, 50, 20,21,null);
	g.drawImage(bullet, 380, 50, 20,21,null);
	g.drawImage(bullet, 240, 50, 20,21,null);
	g.drawImage(bullet, 320, 100, 20,21,null);
	g.drawImage(bullet, 370, 120, 20,21,null);
	g.drawImage(bullet, 430, 160, 20,21,null);
	g.drawImage(bullet, 500, 190, 20,21,null);
	g.drawImage(bullet, 365, 220, 20,21,null);
	g.drawImage(bullet, 325, 250, 20,21,null);
	g.drawImage(bullet, 285, 300, 20,21,null);
	g.drawImage(bullet, 290, 300, 20,21,null);
	g.drawImage(bullet, 480, 300, 20,21,null);
	g.drawImage(bullet, 540, 400, 20,21,null);
	g.drawImage(bullet, 410, 360, 20,21,null);
	g.drawImage(bullet, 270, 370, 20,21,null);
	g.drawImage(bullet, 330,420, 20,21,null);
	g.drawImage(bullet, 405, 480, 20,21,null);
	g.drawImage(bullet, 355, 320, 20,21,null);
	g.drawImage(bullet, 525, 340, 20,21,null);
	g.drawImage(bullet, 585, 290, 20,21,null);
	g.drawImage(bullet, 520, 500, 20,21,null);
	g.drawImage(bullet, 580, 520, 20,21,null);
	g.drawImage(bullet, 440, 530, 20,21,null);
	g.drawImage(bullet, 410, 480, 20,21,null);
	g.drawImage(bullet, 470, 550, 20,21,null);
	g.drawImage(bullet, 330, 600, 20,21,null);
	g.drawImage(bullet, 335, 580, 20,21,null);
	g.drawImage(bullet, 265, 520, 20,21,null);
	g.drawImage(bullet, 425, 450, 20,21,null);
	g.drawImage(bullet, 385, 530, 20,21,null);
	g.drawImage(bullet, 400, 600, 20,21,null);
	g.drawImage(bullet, 280, 650, 20,21,null);
	g.drawImage(bullet, 340, 620, 20,21,null);
	g.drawImage(bullet, 410, 680, 20,21,null);
	g.drawImage(bullet, 270, 690, 20,21,null);
	g.drawImage(bullet, 330, 700, 20,21,null);
	g.drawImage(bullet, 405, 690, 20,21,null);
	g.drawImage(bullet, 265, 720, 20,21,null);
	g.drawImage(bullet, 225, 750, 20,21,null);
	g.drawImage(bullet, 285, 700, 20,21,null);
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("TOILET JUMP", 70, 200);
	g.setFont(titleFont2);
	g.drawString("Press ENTER to start", 120, 300);
}
void drawGameState(Graphics g){
	g.drawImage(background, 0, 0, DoodleJump.width,DoodleJump.height,null);
	doodle.draw(g);
	manager.draw(g);
	manager.checkCollision();
	if (doodle.isAlive==false) {
		currentState=END_STATE;
	}
}
void drawEndState(Graphics g){
	g.drawImage(background, 0, 0, DoodleJump.width,DoodleJump.height,null);
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("GAME OVER", 90, 60);
	String score=Integer.toString(manager.getScore());
	g.drawString(score, 230, 150);
}
public void paintComponent(Graphics g){
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
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}

	}
	void startGame(){
		timer.start();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Typed");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
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
			manager.addObject(new Projectile(doodle.x,doodle.y, 10, 10));
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			doodle.x-=10;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			doodle.x+=10;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}
}
