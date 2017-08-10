package DoodleJump;

import java.awt.Graphics;
import java.awt.Rectangle;

public class DoodleObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive=true;
	Rectangle collisonBox;
	public DoodleObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.collisonBox=new Rectangle();
	}
void update(){
	collisionBox.setBounds(x, y, width, height);
}
void draw(Graphics g){
		
}
}
