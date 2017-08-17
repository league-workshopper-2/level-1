package DoodleJump;

import java.awt.Color;
import java.awt.Graphics;

public class Paper extends DoodleObject{
	Paper(int x, int y, int width, int height){
		super(x,y,width,height);
		
	}
	void update(){
		super.update();
		y+=1;
	}
	void draw(Graphics g){
		g.drawImage(DoodlePanel.bullet, x, y, width, height, null);
	}
}
