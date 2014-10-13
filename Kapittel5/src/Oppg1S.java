import javax.swing.JOptionPane;


public class Oppg1S {

	public static void main(String[] args) {
		//Definerer variabler
		int sum= 0;
				
		for (int i=2; i<=98; i+=2)
			{
			 sum = sum+=i;	
			}
		JOptionPane.showMessageDialog(null, sum);
	}
	
}
