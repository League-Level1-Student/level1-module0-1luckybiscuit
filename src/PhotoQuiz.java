/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String cursed = "https://i.kinja-img.com/gawker-media/image/upload/s--qmP29ccq--/c_scale,f_auto,fl_progressive,q_80,w_800/inzuqhcz6vvxpdodiuph.png";
		// 2. create a variable of type "Component" that will hold your image
                Component image;
		// 3. use the "createImage()" method below to initialize your Component
                createImage(cursed);
		// 4. add the image to the quiz window
                quizWindow.add(image);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
                int curseCounter = JOptionPane.showOptionDialog(null, "Is this what you see in your nightmares?", "Cursed Image", 0, Object["YES", "NO"],);
		// 7. print "CORRECT" if the user gave the right answer
                	if(curseCounter == 1) {
                		JOptionPane.showMessageDialog(null, "CONGRATULATIONS. THIS IS A CURSED IMAGE");
                	}else {
		// 8. print "INCORRECT" if the answer is wrong
                		JOptionPane.showMessageDialog(null, "NO? DARN...");
                	}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

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





