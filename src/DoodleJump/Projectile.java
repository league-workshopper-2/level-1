package DoodleJump;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends DoodleObject{
int speed;
	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		isAlive=true;
		speed = 10;
	}
	void update() {
		super.update();
		y -= speed;
		collisionBox.setBounds(x+40, y, width+20, height+20);

		if (y < 0) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		//g.drawRect(collisionBox.x, collisionBox.y, collisionBox.width, collisionBox.height);
		g.drawImage(DoodlePanel.paper, x+25, y, 48, 50,null);
		
	}
}
