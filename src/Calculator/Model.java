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
boolean operatorpressed;
void addADigit(String num){
	if (num.equals("=")) {
		performOperation();
	}
	else if (num.equals("C")) {
		clear();
	}
	else if (num.equals("X")||num.equals("+")||num.equals("-")||num.equals("/")) {
	operator=num;
	operatorpressed=true;
	
}
else if (operatorpressed==true) {
	number2=number2+num;
}
else if (operatorpressed==false) {
	number1=number1+num;
}


}
void performOperation(){
	int numb1=Integer.parseInt(number1);
	int numb2=Integer.parseInt(number2);
	if (operator=="+") {
		answer=numb1+numb2;
	}
	else if (operator=="-") {
		answer=numb1-numb2;
	}
	else if (operator=="/") {
		answer=numb1/numb2;
	}
	else if (operator=="X") {
		answer=numb1*numb2;
	}
	else {
		
	}
}
void clear(){
	number1="";
	number2="";
	answer=0;
	operator="";
	operatorpressed=false;
}
public String getFirstNum(){
	return number1;
}
public String getSecondNum(){
	return number2;
}
public String getOperator(){
	return operator;
}
public int getAnswer(){
	return answer;
}
Model(){
number1="";	
number2="";
}

}