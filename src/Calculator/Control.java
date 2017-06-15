package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Control implements ActionListener{
View view;
Model model;
Control(Model model,View view){
	this.view=view;
	this.model=model;
	view.addListeners(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b1=(JButton)(e.getSource());
	String text=b1.getText();
	model.addADigit(text);
	view.update();
}
}
