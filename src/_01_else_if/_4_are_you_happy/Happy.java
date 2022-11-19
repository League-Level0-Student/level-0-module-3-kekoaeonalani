package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
	
	String happy = JOptionPane.showInputDialog("Are you happy? Answer yes or no.");
	if (happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what ever you are doing!!");
	}
	
	if (happy.equals("no")) {
		String want = JOptionPane.showInputDialog("Would you like to be happy? Answer yes or no.");

		if (want.equals ("yes")) {
			JOptionPane.showMessageDialog(null, "Change something in your life.");
		}
		

		if (want.equals ("no")) {
			JOptionPane.showMessageDialog(null, "Sure, sure. Just keep being sad.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
