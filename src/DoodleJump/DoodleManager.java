package DoodleJump;

import java.awt.Graphics;
import java.util.ArrayList;

import LeagueInvaders.GameObject;

public class DoodleManager {
	ArrayList<GameObject> objects;
	
	public DoodleManager() {
		objects = new ArrayList<GameObject>();
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}
	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			DoodleObject o = objects.get(i);
			o.update();
			
		}
purgeObjects();
}
	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}
}