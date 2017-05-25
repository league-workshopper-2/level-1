package LeagueInvaders;

import java.awt.Graphics;
import java.awt.Rectangle;


public class GameObject {
int x;
int y;
int width;
int height;
boolean isAlive=true;
Rectangle collisionBox;
public GameObject() {
	this.collisionBox=new Rectangle();
}
void update(){
collisionBox.setBounds(x, y, width, height);

}
void draw(Graphics g){
	
}
}
