
public class spongebobrunner {
public static void main(String[] args) {
	spongebob Spongebob=new spongebob("spongebob");
	Spongebob.eat();
	Spongebob.laugh();
	spongebob Patrick=new spongebob("patrick");
	Patrick.eat();
	Patrick.laugh();
	System.out.println(Patrick.getName());
	spongebob Squidward=new spongebob("squidward");
	Squidward.eat();
	Squidward.laugh();
	System.out.println(Squidward.getName());
}
}