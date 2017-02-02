import java.util.Random;

import javax.swing.JOptionPane;

public class SlotMachine {
	public void bet() {
		String bet = JOptionPane.showInputDialog("How much do you wanna bet");
		int[] winner = randNums();
		win(winner);
	}

	public int[] randNums() {
		int r1 = new Random().nextInt(3);
		int r2 = new Random().nextInt(3);
		int r3 = new Random().nextInt(3);
		int[] nums = new int[3];
		nums[0] = r1;
		nums[1] = r2;
		nums[2] = r3;
		return nums;
	}

	public void win(int[] slotNums) {
		if (slotNums[0] == 0 && slotNums[1] == 0 && slotNums[2] == 0) {
			JOptionPane.showMessageDialog(null, slotNums[0] + slotNums[1] + slotNums[3] + " You Win!");
		}
		if (slotNums[0] == 1 && slotNums[1] == 1 && slotNums[2] == 1) {
			JOptionPane.showMessageDialog(null, slotNums[0] + slotNums[1] + slotNums[3] + " You Win!");
		}
		if (slotNums[0] == 2 && slotNums[1] == 2 && slotNums[2] == 2) {
			JOptionPane.showMessageDialog(null, slotNums[0] + slotNums[1] + slotNums[3] + " You Win!");
		} else {
			JOptionPane.showMessageDialog(null, slotNums[0] + slotNums[1] + slotNums[3] + " You Win!");
		}
	}
}
