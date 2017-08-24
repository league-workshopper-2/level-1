package DoodleJump;

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
		if (y < 0) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		
		g.drawImage(DoodlePanel.paper, x, y, 48, 50,null);
	}
}
