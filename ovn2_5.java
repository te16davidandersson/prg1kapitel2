import javax.swing.*;

/* Uppgift 2.5
David Andersson
18/9 2017
*/

public class ovn2_5{
	public static void main(String[] args){
		
		String namn = JOptionPane.showInputDialog("What is your first name?"); 
		String namn2 = JOptionPane.showInputDialog("What is your last name?");
		String halsning = "Hello " + namn + " " + namn2;
		JOptionPane.showMessageDialog(null, halsning); //Dialogruta
		
	}
}