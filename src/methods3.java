
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class methods3 {
	public static void main(String[] args) {
		eat("sugar");
		JOptionPane.showMessageDialog(null, "Dinner time is " + getDinnerTime());
		chomp();
		if(isTasty() == true) {
			JOptionPane.showMessageDialog(null, "I'm glad you like it!");
		}else {
			JOptionPane.showMessageDialog(null, "I think someone obliterated your taste buds.");
		}
		JFrame window = getWindow();
		int slices = getNumberOfPizzaSlicesLeft();
	    String faveVeggie = getFavoriteVegetable("mom");
	    peel("avocado");
	    boolean healthyOrNot = isHealthy("avocado");
	    simmer("soup"); 
	}
	static JFrame getWindow() {
		return new JFrame();
	}
	private static boolean isHealthy(String food) {
		if(food.equalsIgnoreCase("avocado")||food.equalsIgnoreCase("broccoli")||food.equalsIgnoreCase("potato")||food.equalsIgnoreCase("carrots")) {
			return true;
		}else {
		return false;
		}
	}
	static void simmer(String dish) {
		JOptionPane.showMessageDialog(null, "The " + dish + " has been simmered!");
	}
	static int getNumberOfPizzaSlicesLeft() {
		String a = JOptionPane.showInputDialog("How many pizza slices did you eat?");
		int e = Integer.parseInt(a);
		return 8-e;
	}
	static String getFavoriteVegetable(String fam) {
		if(fam.equalsIgnoreCase("mom")) {
			return "eggplant";
		}else if(fam.equalsIgnoreCase("dad")) {
			return "broccoli";
		}else {
			return "carrots";
		}
	}
	static void peel(String veggie) {
		JOptionPane.showMessageDialog(null, "The " + veggie + " has been peeled!");
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

	static void chomp() {
		JOptionPane.showMessageDialog(null, "Chomp!");
	}
	static boolean isTasty(){
    	if(JOptionPane.showOptionDialog(null, "Is the food tasty?", "Say yes", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Yes", "No" }, null) ==1) {
		return true;
    } else {
      	return false;
    }
    }
}
