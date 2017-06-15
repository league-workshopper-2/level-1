import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame frame;
JButton one;
JButton two;
JButton three;
	
	
	public static void main(String[] args) {
	CutenessTV hi = new CutenessTV();
	hi.go();
	
	
	}
	void go(){
		one = new JButton();
		one.setText("show ducks");
		two = new JButton();
		two.setText("show frog");
		three = new JButton();
		three.setText("show fluffy unicorns");
		frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		frame.pack();
	}
	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=7dS9lSptc6Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=tYKPdNvH800");
	}
	
	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI(videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==one) {
			showDucks();
		}
			else if (e.getSource()==two) {
				showFrog();
			}
			else if (e.getSource()==three) {
				showFluffyUnicorns();
			}
	}


}
