package _02_loop_variables._1_years_alive;
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
		JOptionPane.showMessageDialog(null, "The Wizard shakes his head, and murmurs that he thought he saw potential in you. He pulls out his wand, \n and says that now you know he is a wizard and you wont open your hand, he will kill you. You die. Wrong choice.");
	}
	if (hand.equals("yes")) {
	JOptionPane.showInputDialog( null, "In your hand he places a leaf. The Wizard tells you that this leaf will heal anyone when eaten. \n He warns you, not to use it on yourself, though. He says that the bearer of the leaf must refuse to use it on himself, and the person who gave him the leaf, \n or he will die instantly. You nod your head, and take it. The wizard turns and leaves.");
	String oldMan = JOptionPane.showInputDialog("Its been a few months, and you have not had to use the leaf. Suddenly, you  hear a loud meow in your kitchen. \n Its your cat! The poor animal it laying down on its back(something it never does...)and acting like its about to die. \n you take it to the vet. While you are waiting, an old man comes up to you, and says that \n he knows that you are the Bearer Of The Leaf, and that he demands you heal him. who do you heal? Type in cat for your cat, or man for the old man. ");
	
	if (oldMan.equals("cat")) {
		JOptionPane.showMessageDialog( null,"The old man growls at you, and says that you are smarter than he had expected, and than he was \n indeed the wizard, coming to trick him. He vanishes in a cloud of smoke, your cat heals and you live happily ever after. THE END..." );
		
	}
	if (oldMan.equals("man")) {
		JOptionPane.showInputDialog( null, "As the old man greedily gobbles down the leaf you gave him, he laughs and tells you he is the wizard. You have \n broken the rules of the leaf, and shall perish. You and your cat perish on the spot. THE END...");
		}
	}
	
	if (hand.equals("no")) {
		JOptionPane.showInputDialog( null, "He kills you. You lose.");
	}
}

	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

