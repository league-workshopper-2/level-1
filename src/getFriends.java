import javax.swing.JOptionPane;

public class getFriends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate Lucas=new Classmate();
   	 Classmate Vish=new Classmate();
   	 Classmate David=new Classmate();
   	 
    	//4. set descriptions for each Classmate
   	 Lucas.setDesc("nice");
   	 Vish.setDesc("cool");
   	 David.setDesc("absent");
   	 
   	 //5. Use your getter to print out each description
   	 System.out.println(Lucas.getDesc());
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person

void setDesc(String description){
	this.description=description;
}
	//2. create a getter that gets a description of this person
String getDesc(){
return description;	
}
}


