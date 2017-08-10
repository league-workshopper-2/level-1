package DoodleJump;

import java.awt.Graphics;

public class Doodler extends DoodleObject{
int speed;
	public Doodler(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=20;
	}
void update(){
	
}
void draw(Graphics g){
	g.drawImage(DoodlePanel.doodler, x, y, width,height,null);
}
}
