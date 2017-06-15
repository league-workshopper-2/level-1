package Calculator;

import javax.swing.JOptionPane;

public class Coffee {
int temp;
String brewType;
boolean isDecaf;
public Coffee(int temp, String brewType, boolean isDecaf){
	this.temp=temp;
	this.brewType=brewType;
	this.isDecaf=isDecaf;
}
public static void main(String[] args) {
	Coffee coffee=new Coffee(85, "light", true);
	coffee.serve("John");
}
void serve(String name) {
JOptionPane.showMessageDialog(null, "Here is your order " + name);

}
}
