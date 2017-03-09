package Calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Model {
String number1;
String number2;
int answer;
String operator;
void addADigit(String num){
if (num.equals("X")||num.equals("+")||num.equals("-")||num.equals("/")||num.equals("=")) {
	operator=num;
	
}
number1=number1 + num;
}
Model(){
number1="";	
}
}