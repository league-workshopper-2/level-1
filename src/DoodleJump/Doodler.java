package DoodleJump;

import java.awt.Color;
import java.awt.Graphics;

public class Doodler extends DoodleObject{
int speed;
double gravity = 0.01;
double yVelocity = 0;
int jumpPower = 20;
double newY=0;

	public Doodler(int x, int y, int width, int height) {
		super(x, y, width, height);
		newY=y;
		isAlive=true;
		speed=20;
	}
void update(){
	super.update();
	collisionBox.setBounds(x, (int)newY, width, height);
	yVelocity += gravity;
	newY += yVelocity;

}
void draw(Graphics g){
	g.drawImage(DoodlePanel.doodler, x, (int)newY, width, height,null);
	//g.setColor(Color.RED);
	//g.drawRect(collisionBox.x, collisionBox.y, collisionBox.width, collisionBox.height);
}
}
