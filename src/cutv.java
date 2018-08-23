import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutv implements ActionListener {
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	JButton butt = new JButton();
	JButton but = new JButton();
	JButton boot = new JButton();
	JButton boott = new JButton();
	JButton bott = new JButton();
		public static void main(String[] args) {
			cutv oof = new cutv();
			oof.showButton();
		}
		public void showButton() {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			butt.setText("Ducks");
			but.setText("Unicorns");
			boot.setText("Frogs");
			boott.setText("Chickens");
			bott.setText("Carl");
			JPanel panel = new JPanel();
			panel.setVisible(true);
			frame.add(panel);
			panel.add(butt);
			panel.add(but);
			panel.add(boot);
			panel.add(boott);
			panel.add(bott);
			butt.addActionListener(this);
			but.addActionListener(this);
			boot.addActionListener(this);
			boott.addActionListener(this);
			bott.addActionListener(this);
			frame.pack();
		}
		public void actionPerformed(ActionEvent e) {
			JButton buttonPressed = (JButton) e.getSource();
			if(buttonPressed == butt) {
				showDucks();
			}else if(buttonPressed == but) {
				showFluffyUnicorns();
			}else if(buttonPressed == boot) {
				showFrog();
			}else if(buttonPressed == boott) {
				playVideo("https://www.youtube.com/watch?v=08wUT1ruaYU");
			}else {
				playVideo("https://www.youtube.com/watch?v=gNJ-3blp56w");
			}
		}
}
