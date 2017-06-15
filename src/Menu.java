import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	JLabel label4=new JLabel();
	JTextField text=new JTextField(4);
	JButton button=new JButton();
public Menu(){
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(500, 500);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	panel.add(label4);
	panel.add(text);
	panel.add(button);
	button.setText("Submit");
}
void setlable1(String food){
	label1.setText(food);
}
void setlable2(String food){
	label2.setText(food);
}
void setlable3(String food){
	label3.setText(food);
}
void setlable4(String food){
	label4.setText(food);
}
void addListener(ActionListener Controller){
	button.addActionListener(Controller);
}
public String getOrder(){
	String submit = text.getText();
return submit;
}
}
