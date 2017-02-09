import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotMachine implements ActionListener {
	int[] nums = new int[3];
	JPanel panel =new JPanel();
	JFrame frame =new JFrame();
	JButton text =new JButton();
	JButton text2 = new JButton();
	JButton text3 = new JButton();
	JButton button =new JButton();
	public void bet() {
		String bet = JOptionPane.showInputDialog("How much do you wanna bet");
		int[] winner = randNums();
	}
	public int[] randNums() {
		int r1 = new Random().nextInt(3);
		int r2 = new Random().nextInt(3);
		int r3 = new Random().nextInt(3);
		nums[0] = r1;
		nums[1] = r2;
		nums[2] = r3;
		return nums;
	}
	public void win() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		button.setSize(300, 300);
		button.setText("Pull");
		panel.add(text);
		panel.add(text2);
		panel.add(text3);
		button.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
			text.setText(""+nums[0]);
			text2.setText(""+nums[1]);
			text3.setText(""+nums[2]);
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		if (nums[0] == 1 && nums[1] == 1 && nums[2] == 1) {
			text.setText(""+nums[0]);
			text2.setText(""+nums[1]);
			text3.setText(""+nums[2]);
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2) {
			text.setText(""+nums[0]);
			text2.setText(""+nums[1]);
			text3.setText(""+nums[2]);
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		else {
			text.setText(""+nums[0]);
			text2.setText(""+nums[1]);
			text3.setText(""+nums[2]);
			JOptionPane.showMessageDialog(null, "You Lose!");
		}
	}

}
