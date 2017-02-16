import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Matching implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JLabel label=new JLabel();
	int counter;
	public static void main(String[] args) {
		Matching matching = new Matching();
		matching.stuff();
	}
	public void stuff() {
		frame.add(panel);
		panel.add(label);
		label.setText("Counter: " + counter);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.setVisible(true);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			counter+=1;
		}
		String buttonText1=button1.getText();
		if (e.getSource() instanceof JButton) {
			//if (counter%=2) {
				//buttonText1=((JButton)e.getSource()).getText();
			//}
		}
	}
	
}
