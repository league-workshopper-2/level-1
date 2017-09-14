package DoodleJump;

import java.awt.Color;
import java.awt.Graphics;

public class Doodler extends DoodleObject{
int speed;
double gravity = 0.05;
double yVelocity = 0;
int jumpPower = 20;
double newY=0;
boolean left=false;
boolean right=false;
	public Doodler(int x, int y, int width, int height) {
		super(x, y, width, height);
		newY=y;
		isAlive=true;
		speed=5;
	}
void update(){
	super.update();
	if (left) {
		x-=speed;
	}
	else if (right) {
		x+=speed;
	}
	yVelocity += gravity;
	newY += yVelocity;
	
	collisionBox.setBounds(x+25, (int)newY, 50, height);
	if (newY>800) {
		isAlive=false;
	}	
	if (newY<0) {
		isAlive=false;
	}
	if (x<0-width) {
		x=400+width;
	}
	else if (x>400+width) {
		x=0-width;
	}
}
void draw(Graphics g){
	g.drawImage(DoodlePanel.doodler, x, (int)newY, width, height,null);
	//g.setColor(Color.RED);
	//g.drawRect(collisionBox.x, collisionBox.y, collisionBox.width, collisionBox.height);
}
}
