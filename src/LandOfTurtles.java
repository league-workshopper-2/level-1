import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
//Frame frame=new Frame();
//frame.setVisible(true);
		// 2. Add the panel to the frame
		//frame.add(panel);
		panel.showPanel();
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 
// 5. Add the turtle to the panel 
		//turtle.penDown();
		//turtle.move(100);
		// 6. Put 50 Turtles on the beach
for (int i = 0; i < 1000; i++) {
	Random ran= new Random();
	Turtle turtle=new Turtle();
	int Xpos=ran.nextInt(panel.getWidth());
	int Ypos=ran.nextInt(panel.getHeight());
	panel.addTurtle(turtle);
	turtle.setX(Xpos);
	turtle.setY(Ypos);
}
	}
}

