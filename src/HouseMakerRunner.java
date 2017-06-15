
public class HouseMakerRunner {
public static void main(String[] args) {
	String heightstr;
	HouseMaker h= new HouseMaker();
h.setRobotInCorner();
h.MakeHouse("small","red");
h.MakeHouse2("large","blue");
h.MakeHouse2("small","red");
h.MakeHouse2("large", "green");
h.MakeHouse2("medium","red");
h.MakeHouse2("medium","blue");
h.MakeHouse2("small","green");
h.MakeHouse2("large","red");
h.MakeHouse2("small","green");
h.MakeHouse2("medium","blue");
}
}
