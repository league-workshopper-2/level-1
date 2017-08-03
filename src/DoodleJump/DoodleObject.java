package DoodleJump;

import java.awt.Graphics;

public class DoodleObject {
	int x;
	int y;
	int width;
	int height;
	public DoodleObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
void update(){
	
}
void draw(Graphics g){
	g.fillRect(10, 10, 100, 100);	
}
}
