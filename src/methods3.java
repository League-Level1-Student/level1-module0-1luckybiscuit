import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class methods3 {
	public static void main(String[] args) {
		eat("sugar");
		JOptionPane.showMessageDialog(null, "Dinner time is " + getDinnerTime());
		chomp();
	}

	static void eat(String food) {
		JOptionPane.showMessageDialog(null, "We are eating " + food + " for dinner!");
	}

	static String getDinnerTime() {
		Random h = new Random();
		int oof = h.nextInt(7) + 6;
		Random tm = new Random();
		int oofo = tm.nextInt(61);
		return oof + ":" + oofo;
	}

	static String getFavoriteFood(String personsName) {
		return JOptionPane.showInputDialog("What is " + personsName + "'s favorite food?");
	}

	public void chomp() {
		playSound("toastChomp.aiff");
	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static boolean isTasty(){
    	if(JOptionPane.showOptionDialog(null, "Is the food tasty?", "Say yes", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Yes", "No" }, null) ==1) {
		return true;
    } else {
    }
}
