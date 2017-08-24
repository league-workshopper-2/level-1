package DoodleJump;

import java.awt.Graphics;


public class Platform extends DoodleObject {

	public Platform(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	void update(){
		super.update();
		y-=1;
	}
	void draw(Graphics g){
		g.drawImage(DoodlePanel.platform, x, y, width, height, null);
	}
}
