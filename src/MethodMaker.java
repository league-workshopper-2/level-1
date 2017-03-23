

import javax.swing.JOptionPane;

public class MethodMaker {
	void go() {
		// 2. Call the method created in step 1
		method1();
		
		// 4. Call the method you created in step 3 with an int parameter that tells 
		//    how old you will be by the end of this year
		method2(5);
		// 6. Call the method created in step 5 with a String and an int parameter
		method3("bob",5);
		// 8. Call the method created in step 7 with 2 integers, multiply these numbers and display the result.
		method4(5,5);
	}

	// 1. Create a method that asks the user's name and says they ROCK!
	//    Hint: void yourMethodName() {   
	
	//          }
	void method1(){
	String name=JOptionPane.showInputDialog("Whats your name?");
	JOptionPane.showMessageDialog(null, name+ "rocks!");
	}
	
	// 3. Create a method that has an int parameter for how old you will be by the end of this year, 
	//    and creates a pop-up that tells you what year you were born.
	//    Hint: void yourMethodName(int age) {    
	void method2(int age){
		JOptionPane.showMessageDialog(null, "You were born in " + (2017-age));
	}
	//          }

	
	// 5. Create a method with a String parameter and an int parameter "numTimes" which
	//    prints the String parameter "numTimes".
	//    No more hints for creating methods! 
	//         Copy what you did in steps 1 & 3, but with different parameter types.
void  method3(String Parameter, int numTimes){
	for (int i = 0; i < numTimes; i++) {
		JOptionPane.showMessageDialog(null, Parameter);
	}
}
	
	// 7. Create a method that multiplies 2 numbers that are passed in as parameters
	//    and displays the results in a pop-up.
void method4(int num1, int num2){
	JOptionPane.showMessageDialog(null, num1*num2);
}

	public static void main(String[] args) {
		new MethodMaker().go();
	}

}

