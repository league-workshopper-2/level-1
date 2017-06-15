import javax.swing.JOptionPane;

public class Model {
	String item1 = "burger";
	String item2 = "steak";
	String item3 = "pasta";
	String item4 = "salad";

	String getitem1() {
		return item1;
	}

	String getitem2() {
		return item2;
	}

	String getitem3() {
		return item3;
	}

	String getitem4() {
		return item4;
	}

	public void check(String order) {
		if (order.equals(item1)) {
			JOptionPane.showMessageDialog(null,"You have ordered a " + order);
		}
		else if (order.equals(item2)) {
			JOptionPane.showMessageDialog(null,"You have ordered a " + order);
		}
		else if (order.equals(item3)) {
			JOptionPane.showMessageDialog(null,"You have ordered a " + order);
		}
		else if (order.equals(item4)) {
			JOptionPane.showMessageDialog(null,"You have ordered a " + order);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry we don't have that item on the menu");
		}
	}
}