import javax.swing.*;

/* Uppgift 2.1
David Andersson
18/9 2017
*/

public class ovn2_1{
	public static void main(String[] args){
		String namn;
		namn = "David Andersson";
		String nummer;
		nummer = "\n070234234";
		String adress;
		adress = "\nDrottninggatan 1";
		String info = namn + nummer + adress;
		JOptionPane.showMessageDialog(null,info);
	}
}