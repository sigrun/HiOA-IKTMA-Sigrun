import javax.swing.JOptionPane;


public class Oppg1 {

	public static void main(String[] args) {
		String utskrift = "";//tom utskrift for å?
		
		for ( int i = 1; i <100; i++ )
		    
			utskrift += i + "\n";
		   
		
		JOptionPane.showMessageDialog(null, utskrift);

	}

}
