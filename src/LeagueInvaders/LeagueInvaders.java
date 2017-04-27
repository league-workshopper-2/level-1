package LeagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel game;
	int width=500;
	int height=800;
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
	frame.setSize(width, height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	game.StartGame();
	frame.addKeyListener(game);
}
}
