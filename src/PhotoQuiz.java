 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int score=0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String pic = "https://www.royalcanin.com/~/media/Royal-Canin/Product-Categories/cat-adult-landing-hero.ashx";
		// 2. create a variable of type "Component" that will hold your image
Component picture;
		// 3. use the "createImage()" method below to initialize your Component
picture=createImage(pic);
		// 4. add the image to the quiz window
quizWindow.add(picture);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans=JOptionPane.showInputDialog("What is in this image: cat or dog");
		// 7. print "CORRECT" if the user gave the right answer
if (ans.equals("cat")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
	score--;
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(picture);
		// 10. find another image and create it (might take more than one line of code)
String image="http://r.ddmcdn.com/s_f/o_1/cx_633/cy_0/cw_1725/ch_1725/w_720/APL/uploads/2014/11/too-cute-doggone-it-video-playlist.jpg";
Component ima;
ima=createImage(image);
		// 11. add the second image to the quiz window
quizWindow.add(ima);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question=JOptionPane.showInputDialog("What is in this image: cat or dog");
		// 14+ check answer, say if correct or incorrect, etc.
if (question.equals("dog")) {
	JOptionPane.showMessageDialog(null, "Correct");
score++;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
score--;
}
JOptionPane.showMessageDialog(null, "Your score is " + score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




