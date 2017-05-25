package LeagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	public static int width=500;
	public static int height=800;	
	JFrame frame;
	GamePanel game;

public static void main(String[] args) {
	LeagueInvaders leauge =new LeagueInvaders();
	
}
public LeagueInvaders(){
	frame=new JFrame();
	game=new GamePanel();
	setup();
}
void setup(){
	frame.add(game);
	frame.setVisible(true);
	frame.setSize(LeagueInvaders.width, LeagueInvaders.height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	game.StartGame();
	frame.addKeyListener(game);
}
}
