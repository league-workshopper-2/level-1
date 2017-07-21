package DoodleJump;

import java.awt.Graphics;



public class Doodle extends DoodleObject{
	int speed;	
Doodle(int x, int y, int width, int height){
		super(x,y,width,height);	
		isAlive=true; 
		speed=20;
	}

void update(){
	super.update();
	
}
void draw(Graphics g){
	g.drawImage(DoodlePanel.DoodlerImg, x, y, width, height, null);
}
}
