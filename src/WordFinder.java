import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WordFinder implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5= new JButton();
	JTextField text= new JTextField();
	public static void main(String[] args) {
		WordFinder word = new WordFinder();
		word.drawButtons(4);
	}

	void drawButtons(int buttons) {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(text);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button1.setText("b");
		button2.setText("t");
		button3.setText("o");
		button4.setText("a");
		button5.setText("Submit");
		
	}
String result;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
				result+=button1.getText();
				text.setText(button1.getText());	
		}
		
	}
	
}
