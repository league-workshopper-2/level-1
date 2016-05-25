
public class FrogRunner {
	public static void main(String[] args) {
		Frog one=new Frog("Jimmy",3,"green");
		Frog two=new Frog("Mike",6,"orange");
		Frog three=new Frog("Sammy",5,"yellow");
		Frog four = new Frog("James",8,"red");
		Frog croak = new Frog("Toby", 1, "rainbow!");
		one.ribbit();
		four.ribbit();
		croak.ribbit();
	}
}
