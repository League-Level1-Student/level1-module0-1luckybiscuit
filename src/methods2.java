import javax.swing.JOptionPane;

public class methods2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You should get a " + whichPresent("Josh"));
		if(doPigsEat(JOptionPane.showInputDialog("What do pigs eat?")) == true) {
			JOptionPane.showMessageDialog(null, "Yup, pigs eat that!");
		}else {
			JOptionPane.showMessageDialog(null, "No way pigs eat that.");
		}
	}
	static String whichPresent(String friendName) {
		return JOptionPane.showInputDialog("What does " + friendName + " want for Christmas?");
	}
	static boolean doPigsEat(String food) {

	       if(food.equals("roots")||food.equals("sludge")||food.equals("carrots")) {

	              return true;

	       //more code here
	}
	              else {return false;}

	}
}
