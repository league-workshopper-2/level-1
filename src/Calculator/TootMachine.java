package Calculator;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3= new JButton();
public static void main(String[] args) {
	TootMachine toot=new TootMachine();
	toot.ButtonsNStuff();
}
void ButtonsNStuff(){
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	button1.setText("Fart");
	button2.setText("Fart");
	button3.setText("Fart");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource()==button1) {
		playSound("fart1.wav");
	}
	else if (e.getSource()==button2) {
		playSound("fart2.wav");
	}
	else {
		playSound("fart3.wav");
	}
}
}
