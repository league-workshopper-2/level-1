package DoodleJump;

import javax.swing.JFrame;

import LeagueInvaders.GamePanel;
import LeagueInvaders.LeagueInvaders;



public class DoodleJump {
	public static int width=50;
	public static int height=800;	
	JFrame frame;
	DoodlePanel game;

public static void main(String[] args) {
	DoodleJump jump=new DoodleJump();
	
}
public DoodleJump(){
	frame=new JFrame();
	game=new DoodlePanel();
	setup();
}
void setup(){
	frame.add(game);
	frame.setVisible(true);
	frame.setSize(LeagueInvaders.width, LeagueInvaders.height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	game.startGame();
	frame.addKeyListener(game);
}
}
