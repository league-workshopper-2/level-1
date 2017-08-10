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
public DoodlePanel() {
	timer=new Timer(1000/60, this);
	titleFont = new Font("Arial", Font.PLAIN, 48);
	titleFont2 = new Font("Arial", Font.PLAIN, 25);
	doodle = new Doodler(225, 700, 50, 50);
	manager.addObject(doodle);
	try {
		background=ImageIO.read(this.getClass().getResourceAsStream("background.png"));
		doodler=ImageIO.read(this.getClass().getResourceAsStream("Doodler.png"));
		platform=ImageIO.read(this.getClass().getResourceAsStream("Platform.png"));
		bullet=ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void updateMenuState(){
	
}
void updateGameState(){
manager.update();	
}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.drawImage(background, 0, 0, DoodleJump.width,DoodleJump.height,null);
	g.drawImage(doodler, 200, 500, 100,100,null);
	g.drawImage(platform, 190, 590, 100,20,null);
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("DOODLE JUMP", 70, 200);
	g.setFont(titleFont2);
	g.drawString("Press ENTER to start", 120, 300);
}
void drawGameState(Graphics g){
	g.drawImage(background, 0, 0, DoodleJump.width,DoodleJump.height,null);
	doodle.draw(g);
	manager.draw(g);
}
void drawEndState(Graphics g){
	g.drawImage(background, 0, 0, DoodleJump.width,DoodleJump.height,null);
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("GAME OVER", 90, 60);
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
