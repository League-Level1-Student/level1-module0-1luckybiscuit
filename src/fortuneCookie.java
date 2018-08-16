import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
	public static void main(String[] args) {
		fortuneCookie fc = new fortuneCookie();
		fc.showButton();
	}
	public void showButton() {
		System.out.println("Button Clicked!");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton butt = new JButton();
		frame.add(butt);
		butt.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Your fortune is...");
		int myIQ = new Random().nextInt(5);
		if(myIQ == 0) {
			JOptionPane.showMessageDialog(null, "Beware of a man dressed in red and white stripes.");
		}else if(myIQ == 1) {
			JOptionPane.showMessageDialog(null, "Beware of big boys with big egos.");
		}else if(myIQ == 2) {
			JOptionPane.showMessageDialog(null, "Do not spit into a jar of mayonnaise.");
		}else if(myIQ == 3) {
			JOptionPane.showMessageDialog(null, "You will be given immense wealth, but in a form not very useful to you.");
		}else {
			JOptionPane.showMessageDialog(null, "In the next two months, a green man with weird ears will appear. Do not run away from him.");
		}
	}
}
