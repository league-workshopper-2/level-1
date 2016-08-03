import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	JFrame frame;
	JButton button;
	JButton button1;
	boolean joke=false;

	public static void main(String[] args) {
		chuckleclicker hi = new chuckleclicker();
		hi.go();

	}

	private void go() {
		frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		button = new JButton();
		button.setText("Joke");
		button1 = new JButton();
		button1.setText("Punchline");
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource() == button) {
			joke = true;
			JOptionPane.showMessageDialog(null, "What did the Buffalo say to his son when he went off to college");
		} else if (e.getSource() == button1) {
			if (joke) {
				JOptionPane.showMessageDialog(null, "Bison");
			
			}

			else {
				JOptionPane.showMessageDialog(null, "click on the Joke first");
			}
		}
	}
}