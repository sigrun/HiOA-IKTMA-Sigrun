import javax.swing.JOptionPane;


public class Oppg3 {

	public static void main(String[] args) {
		
		// Deklarasjon av variabler
		String tidstreng;
		int tid = 0;
		int timer, minutter, sekunder;
		
		// Leser inn ant sekunder i streng
		tidstreng = JOptionPane.showInputDialog(" Skriv inn antall sekunder: ");
		  
		while ( tid >= 0 )
		  {
			// Konverterer tidsstreng til tall
			tid = Integer.parseInt(tidstreng);
			
			//Regner om sekunder til minutter
			timer = tid/3600;
			minutter = (tid%3600)/60;
			sekunder = tid - timer*3600 - minutter*60;
		    
			// Skriver ut resultat
			JOptionPane.showMessageDialog(null, timer + " timer " 
			+ minutter + " minutter og " + sekunder + " sekunder");
		  
			// Leser inn ant sekunder i streng
			tidstreng = JOptionPane.showInputDialog(" SKriv inn antall sekunder: ");
		  }
		
		

		
		

	}

}
