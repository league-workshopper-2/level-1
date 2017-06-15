
public class athlete {
static String venue ="Rio";
String name;
int height;
int bibNumber;
static int count=0;
athlete(String name, int height){
	this.name=name;
	this.height=height;
	count++;
	this.bibNumber=count;
}
public static void main(String[] args) {
	athlete john = new athlete("john",72);
	athlete phelps = new athlete("phelps", 72);
	System.out.println(john.bibNumber);
	System.out.println(phelps.bibNumber);
	System.out.println("phelps venue is "+phelps.venue);
	phelps.venue="paris";
	System.out.println(john.venue);
}
}