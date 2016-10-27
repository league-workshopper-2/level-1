import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.event.ActionListener;
import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Monster implements ActionListener {
public static void main(String[] args) {
	Monster monster = new Monster();
monster.createui();
}
public Monster(){
	

}
private void playSound(String fileName) {
	AudioClip sound = JApplet
			.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button1) {
		playSound("witch.wav");
	}
	if (e.getSource()==button3) {
		playSound("clown.wav");
	}

}
JPanel panel =new JPanel();
JFrame frame =new JFrame();
JButton button1 =new JButton();
JButton button2 =new JButton();
JButton button3 =new JButton();
JButton button4 =new JButton();
JButton button5 =new JButton();
public void createui(){
	frame.add(panel);
	frame.pack();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	button1.setText("Ghost");
	button2.setText("Zombie");
	button3.setText("Clown");
	button4.setText("Trick");
	button5.setText("Treat");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	frame.setVisible(true);
}
}
