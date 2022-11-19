import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	
JOptionPane.showMessageDialog(null, "This is a choose your own adventure game, called THE BEARER OF THE LEAF. If you die, you lose.");	
String secret = JOptionPane.showInputDialog("You are walking down the street, and the sun is begining go set. A man in a black cloak \n comes up to you, and asks you if you would like to know a secret. Do you say yes, or no?");

if (secret.equals("no")) {
	JOptionPane.showMessageDialog(null, "The strange man points a stick at you and tells you that he has put a curse on you to die tomorrow.\n You die the next day. You lose.");
}
	
if (secret.equals("yes")) {
	String hand = JOptionPane.showInputDialog( "The man nodds. You have made the right choice. He leans close to you, and whispers into your ear. \n He tells you that he is a wizard, and he is capable of many things. \n He tells you to hold out your hand. yes, or no?");
	
	if (secret.equals("no")) {
		JOptionPane.showMessageDialog(null, "The Wizard shakes his head, and murmurs that he thought hw saw potential in you. He pulls out his wand, \n and says that now you know he is a wizard and you wont open your hand, he will kill you. You die. Wrong choice.");
	}
	if (hand.equals("yes")) {
	JOptionPane.showInputDialog( null, "In your hand he places a leaf. The Wizard tells you that this leaf will heal anyone when eaten. \n He warns you, not to use it on yourself, though. He says that the bearer of the leaf must refuse to use it on himself, \n or he will die instantly. You nod your head, and take it. The wizard turns and leaves.");
	}
	
	if (hand.equals("no")) {
		JOptionPane.showInputDialog( null, "He kills you. You lose.");
	}
}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

