import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class house {
 public static void main(String[] args) {
	Tortoise.setSpeed(10);
	Tortoise.setX(10);
	Tortoise.setY(400);
	Tortoise.show();
	Tortoise.turn(90);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(20);
	Tortoise.turn(270);
	drawHouse("large","pink");
	drawBuilding("small","blue");
	drawBuilding("medium","red");
	drawHouse("large","blue");
	drawBuilding("medium","red");
	drawHouse("large","pink");
	drawBuilding("small","blue");
	
}
static void drawHouse(String size,String color){
	int length;
	if (size.equals("small")) {
	length=60;	
	}
	else if (size.equals("medium")) {
		length=120;
	}
	else {
		length=250;
	}
	if (color.equals("red")) {
		Tortoise.setPenColor(Color.red);
	}
	else if (color.equals("blue")) {
	Tortoise.setPenColor(Color.blue);	
	}
	else {
		Tortoise.setPenColor(Color.pink);
	}
	Tortoise.move(length);	
	Tortoise.turn(45);
	Tortoise.move(20);
	Tortoise.turn(90);
	Tortoise.move(20);
	Tortoise.turn(45);
	Tortoise.move(length);
	Tortoise.turn(270);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(20);
	Tortoise.turn(270);
	}
static void drawBuilding(String size, String color){
	int length;
	if (size.equals("small")) {
	length=60;	
	}
	else if (size.equals("medium")) {
		length=120;
	}
	else {
		length=250;
	}
	if (color.equals("red")) {
		Tortoise.setPenColor(Color.red);
	}
	else if (color.equals("blue")) {
	Tortoise.setPenColor(Color.blue);	
	}
	else {
		Tortoise.setPenColor(Color.pink);
	}
	
Tortoise.move(length);
Tortoise.turn(90);
Tortoise.move(20);
Tortoise.turn(90);
Tortoise.move(length);
Tortoise.turn(270);
Tortoise.setPenColor(Color.green);
Tortoise.move(20);
Tortoise.turn(270);
}
}
