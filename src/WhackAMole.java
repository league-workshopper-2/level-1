import java.util.Random;

import javax.activation.MailcapCommandMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	public static void main(String[] args) {
	WhackAMole mole= new WhackAMole();
	mole.drawButtons(24);
	}
	void drawButtons(int ran){
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setVisible(true);
		frame.setSize(250,300);
		frame.add(panel);
		JButton button=new JButton();
		JButton button2=new JButton();
		JButton button3=new JButton();
		JButton button4=new JButton();
		JButton button5=new JButton();
		JButton button6=new JButton();
		JButton button7=new JButton();
		JButton button8=new JButton();
		JButton button9=new JButton();
		JButton button10=new JButton();
		JButton button11=new JButton();
		JButton button12=new JButton();
		JButton button13=new JButton();
		JButton button14=new JButton();
		JButton button15=new JButton();
		JButton button16=new JButton();
		JButton button17=new JButton();
		JButton button18=new JButton();
		JButton button19=new JButton();
		JButton button20=new JButton();
		JButton button21=new JButton();
		JButton button22=new JButton();
		JButton button23=new JButton();
		JButton button24=new JButton();
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		JButton[] intOfArrays= new JButton[24];
		intOfArrays[0]=button;
		intOfArrays[1]=button2;
		intOfArrays[2]=button3;
		intOfArrays[3]=button4;
		intOfArrays[4]=button5;
		intOfArrays[5]=button6;
		intOfArrays[6]=button7;
		intOfArrays[7]=button8;
		intOfArrays[8]=button9;
		intOfArrays[9]=button10;
		intOfArrays[10]=button11;
		intOfArrays[11]=button12;
		intOfArrays[12]=button13;
		intOfArrays[13]=button14;
		intOfArrays[14]=button15;
		intOfArrays[15]=button16;
		intOfArrays[16]=button17;
		intOfArrays[17]=button18;
		intOfArrays[18]=button19;
		intOfArrays[19]=button20;
		intOfArrays[20]=button21;
		intOfArrays[21]=button22;
		intOfArrays[22]=button23;
		intOfArrays[23]=button24;
		button.addActionListener(null);
		button2.addActionListener(null);
		button3.addActionListener(null);
		button4.addActionListener(null);
		button5.addActionListener(null);
		button6.addActionListener(null);
		button7.addActionListener(null);
		button8.addActionListener(null);
		button9.addActionListener(null);
		button10.addActionListener(null);
		button11.addActionListener(null);
		button12.addActionListener(null);
		button13.addActionListener(null);
		button14.addActionListener(null);
		button15.addActionListener(null);
		button16.addActionListener(null);
		button17.addActionListener(null);
		button18.addActionListener(null);
		button19.addActionListener(null);
		button20.addActionListener(null);
		button21.addActionListener(null);
		button22.addActionListener(null);
		button23.addActionListener(null);
		button24.addActionListener(null);
		Random rand=new Random();
		intOfArrays[rand.nextInt(24)].setText("mole!");
	
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

}
