import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class lottery_button implements ActionListener {
public static void main(String[] args) {

lottery_button hi = new lottery_button();
hi.go();

}

private void go() {
	JFrame frame =new JFrame();
	JButton button =new JButton();
	frame.add(button);
	frame.setVisible(true);
	frame.pack();
	button.setText("button");
	button.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int num;
	num= new Random().nextInt(100)+1;
	JOptionPane.showMessageDialog(null, num );
}

}
