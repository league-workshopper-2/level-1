import java.nio.charset.MalformedInputException;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.*;

public class GridWorld2 {

	public GridWorld2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		World world = new World();
		// smile(world);
		checkers(world);
	}

	static void smile(World world) {

		world.show();
		Bug bug = new Bug();
		Flower flower = new Flower();
		Location location = new Location(5, 2);
		Location location1 = new Location(3, 3);
		Location location2 = new Location(6, 3);
		Location location3 = new Location(4, 4);
		Location location4 = new Location(6, 4);
		Location location5 = new Location(3, 5);
		Location location6 = new Location(6, 5);
		Location location7 = new Location(5, 6);
		world.add(location, bug);
		world.add(location1, flower);
		world.add(location2, bug);
		world.add(location3, flower);
		world.add(location4, bug);
		world.add(location4, bug);
		world.add(location5, flower);
		world.add(location6, bug);
		world.add(location7, bug);
	}

	static void checkers(World world) {
		world.show();
		Flower flower = new Flower();
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				Location location = new Location(i,j);
				
			if ((i+j) % 2==0) {
				world.add(location, flower);
			}
			}
		}

	}
}
