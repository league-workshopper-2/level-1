public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate tommy=new Classmate();
   	 Classmate teacher=new Classmate();
   	 Classmate haris =new Classmate();
    	//4. set descriptions for each Classmate
   	 tommy.setDescription("nice, helpful, and smart");
   	 teacher.setDescription("helpful, amazing, humble, and a genius");
   	 haris.setDescription("me, myself, and i");
   	 //5. Use your getter to print out each description
   	System.out.println(tommy.getDescription());
   	 System.out.println(teacher.getDescription());
   	 System.out.println(haris.getDescription());
	}





}
class Classmate{
	String description;
    
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}


