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
import javax.swing.JPanel;

public class sfxMachine implements ActionListener {
	JButton butt = new JButton();
	JButton but = new JButton();
	JButton boot = new JButton();
	JButton boott = new JButton();
		public static void main(String[] args) {
			sfxMachine oof = new sfxMachine();
			oof.showButton();
		}
		public void showButton() {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			butt.setText("flush");
			but.setText("noice");
			boot.setText("bwaaaah");
			boott.setText("bad joke");
			JPanel panel = new JPanel();
			panel.setVisible(true);
			frame.add(panel);
			panel.add(butt);
			panel.add(but);
			panel.add(boot);
			panel.add(boott);
			butt.addActionListener(this);
			but.addActionListener(this);
			boot.addActionListener(this);
			boott.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			JButton buttonPressed = (JButton) e.getSource();
			if(buttonPressed == butt) {
				playSound("flush.wav");
			}else if(buttonPressed == but) {
				playSound("noice.wav");
			}else if(buttonPressed == boot) {
				playSound("airhorn.wav");
			}else if(buttonPressed == boott) {
				playSound("baDumTss.wav");
			}else {
				
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
