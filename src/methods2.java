import java.util.Random;

import javax.swing.JOptionPane;

public class methods2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You should get a " + whichPresent("Josh"));
		if (doPigsEat(JOptionPane.showInputDialog("What do pigs eat?")) == true) {
			JOptionPane.showMessageDialog(null, "Yup, pigs eat that!");
		} else {
			JOptionPane.showMessageDialog(null, "No way pigs eat that.");
		}
		JOptionPane.showMessageDialog(null, "Your lucky number is " + getMyLuckyNumber());
		eggsMomWants();
		eggsDadWants();
		eggsBabyWants();
		JOptionPane.showMessageDialog(null, "Your height is probably around " + getAverageHeight(Integer.parseInt(JOptionPane.showInputDialog("What's your age?"))));
	}

	static String whichPresent(String friendName) {
		return JOptionPane.showInputDialog("What does " + friendName + " want for Christmas?");
	}

	static boolean doPigsEat(String food) {

		if (food.equals("roots") || food.equals("sludge") || food.equals("carrots")) {

			return true;

			// more code here
		} else {
			return false;
		}

	}

	static int getMyLuckyNumber() {
		String num = JOptionPane.showInputDialog("What's your lucky number?");
		return Integer.parseInt(num);
	}

	 static void eggsMomWants() {
		Random mom = new Random();
		int oof = mom.nextInt(12);
		// some code
		JOptionPane.showMessageDialog(null, "Your mom wants " + oof + " eggs");
	}

	static void eggsDadWants() {
		Random dad = new Random();
		int oof = dad.nextInt(12);
		// some code
		JOptionPane.showMessageDialog(null, "Your dad wants " + oof + " eggs");
	}

	static void eggsBabyWants() {
		Random bab = new Random();
		int oof = bab.nextInt(12);
		// some code
		JOptionPane.showMessageDialog(null, "Your bab wants " + oof + " eggs");
	}

	static int getAverageHeight(int age) {

		if (age > 50 && age < 100) {

			return 40;

		} else if (age > 100) {

			return 34;

		} else if (age < 50 && age > 10) {
			return 26;
		} else if (age < 10) {

			return 20;

		} else {
			return 0;
		}
	}
}
