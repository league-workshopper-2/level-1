package Calculator;

public class Rocket {
private String name;
private int fuel;
public Rocket(int fuel, String name) {
	System.out.println("Constructing Rocket");
this.fuel=fuel;
this.name=name;
}
 void launch() {
for (int i = fuel; i > 0; i--) {
	fuel-=1;
	System.out.println(i);
	if (fuel==0) {
		System.out.println("Out Of Fuel");
	}
	else {
		
	}
}
}
}
