
public class RobotArmy {
	public static void main(String[] asd){
		
		//1. create a new human
Human human=new Human("Haris");
		//2. create a new Robot army of good and evil robots.
Robot robot1=new Robot("robot1", true);
Robot robot2=new Robot("robot2", true);
Robot robot3=new Robot("robot3", false);
Robot robot4=new Robot("robot4", false);
Robot robot5=new Robot("robot5", true);	
Robot robot6=new Robot("robot6", false);
		//3. command your robot army to destroy a human
robot1.destroy(human);
robot2.destroy(human);
robot3.destroy(human);
robot4.destroy(human);
robot5.destroy(human);
robot6.destroy(human);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
	}
	}
	void setRobot(String name){
	this.Robot=obot;
	}
}
