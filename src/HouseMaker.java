import org.jointheleague.graphical.robot.Robot;

public class HouseMaker {
	Robot r2d2 = new Robot();
	void setRobotInCorner(){
	r2d2.hide();
	r2d2.setX(50);
	r2d2.setY(900);
	}
	
	void MakeHouse(String heightstr, String color){
		int height=0;
		if (heightstr.equals("small")) {
		height=60;	
		}
		if (heightstr.equals("medium")) {
			height=120;
		}
		if (heightstr.equals("large")) {
			height=250;
		}
		if (color.equals("red")) {
			r2d2.setPenColor(255,0,0);
		}
		if (color.equals("blue")) {
			r2d2.setPenColor(0,0,255);
		}
		if (color.equals("green")) {
			r2d2.setPenColor(0,255,51);
		}
		r2d2.setSpeed(10);
		r2d2.hide();
		r2d2.penDown();
		r2d2.move(height);
		r2d2.turn(90);
		r2d2.move(71);
		r2d2.turn(90);
		r2d2.move(height);
		r2d2.turn(270);
		r2d2.move(25);
	}
	void MakeHouse2(String heightstr,String color){
		int height=0;
		if (heightstr.equals("small")) {
			height=60;	
			}
			if (heightstr.equals("medium")) {
				height=120;
			}
			if (heightstr.equals("large")) {
				height=250;
			}
			if (color.equals("red")) {
				r2d2.setPenColor(255,0,0);
			}
			if (color.equals("blue")) {
				r2d2.setPenColor(0,0,255);
			}
			if (color.equals("green")) {
				r2d2.setPenColor(0,255,51);
			}
		r2d2.setSpeed(10);
		r2d2.hide();
		r2d2.penDown();
		r2d2.turn(270);
		r2d2.move(height);
		r2d2.turn(90);
		r2d2.move(71);
		r2d2.turn(90);
		r2d2.move(height);
		r2d2.turn(270);
		r2d2.move(25);
		
		
		//makes a peak:
		//r2d2.turn(45);
		//r2d2.move(50);
		//r2d2.turn(90);
		//r2d2.move(50);
		//r2d2.turn(45);
	}
}
