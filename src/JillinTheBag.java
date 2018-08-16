import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JillinTheBag implements ActionListener {
	int score = 0;
		public static void main(String[] args) {
			JillinTheBag fc = new JillinTheBag();
			fc.showButton();
		}
		public void showButton() {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			JButton butt = new JButton();
			frame.add(butt);
			butt.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			score++;
			System.out.println(score);
			if(score >= 5) {
				createLabelImage("jackInTheBox.jpg");
				JOptionPane.showMessageDialog(null, "It's a Jack AS the box!!!1!11!1!!");
				showPicture("jackInTheBox.jpg");
				playSound("mineDiamonds.wav");
			}
		}
		private void showPicture(String fileName) { 
		     try {
		          JLabel imageLabel = createLabelImage(fileName);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
		private JLabel createLabelImage(String fileName) {
		     try {
		          URL imageURL = getClass().getResource(fileName);
		          if (imageURL == null) {
		               System.err.println("Could not find image " + fileName);
		               return new JLabel();
		          } else {
		               Icon icon = new ImageIcon(imageURL);
		               JLabel imageLabel = new JLabel(icon);
		               return imageLabel;
		          }
		     } catch (Exception e) {
		          System.err.println("Could not find image " + fileName);
		          return new JLabel();
		     }
		}
		private void playSound(String soundFile) { 
		     try {
		          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		          sound.play();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
}
