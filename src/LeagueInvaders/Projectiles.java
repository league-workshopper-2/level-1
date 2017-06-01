package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectiles extends GameObject {
	int speed;

	Projectiles(int x, int y, int width, int height) {
		super();
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
		System.out.println("sdfghjkl");
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
}
