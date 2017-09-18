import javax.swing.*;

/* Uppgift 2.2
David Andersson
18/9 2017
*/

public class ovn2_2{
	public static void main(String[] args){
		
		String namn = "David Andersson";
		String nummer = "\n070234234";
		String adress = "\nDrottninggatan 1";
		String info = namn + nummer + adress;
		JOptionPane.showMessageDialog(null,info);
	}
}