import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
public static void main(String[] args) {
	World world= new World();
	world.show();
	Location location2=new Location(4,1);
	Location location3=new Location(4,3);
	Location location=new Location(2,5);
	Location location1=new Location(4,2);
	Bug bug=new Bug();
	world.add(location, bug);
	Bug bug1=new Bug();
	world.add(location1, bug1);
	bug1.setColor(Color.blue);
	bug1.turn();
	bug1.turn();
	Flower flower2=new Flower();
	Flower flower3=new Flower();
	world.add(location2, flower2);
	world.add(location3, flower3);
	for (int i = 0; i <10; i++) {
		for (int j = 0; j < 10; j++) {
	Location location4=new Location(i,j);
	Flower flower4=new Flower();
	world.add(location4, flower4);
	}
	}
	
}
}
