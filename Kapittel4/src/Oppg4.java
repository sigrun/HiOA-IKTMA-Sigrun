import javax.swing.JOptionPane;


public class Oppg4 {

	public static void main(String[] args) {
		
		// Deklarasjon av variabler
		int timer, minutter, sekunder;
		
		// Leser inn ant sekunder i streng
		String tidstreng = JOptionPane.showInputDialog(" Skriv inn antall sekunder: ");
		
		// Konverterer tidsstreng til tall
		int tid = Integer.parseInt(tidstreng);  
		
		while ( tid >= 0 )
		  {
			//Regner om sekunder til minutter
			timer = tid/3600;
			minutter = (tid%3600)/60;
			sekunder = tid - timer*3600 - minutter*60; //er variabelen tid blitt til mindre enn 10000 (første input) her?
			
			String utskrift = "";
			if (timer > 0)
			{
				utskrift = timer + " timer ,";
			}
			if (minutter > 0)
			{
				utskrift += minutter + " minutt og ";	
			}

			utskrift += sekunder + " sekund. ";
			
			// Skriver ut resultat
			JOptionPane.showMessageDialog(null, utskrift);
		  
			// Leser inn ant sekunder i streng og konverterer
			tidstreng = JOptionPane.showInputDialog(" Skriv inn antall sekunder. Skriv minus for å komme ut av løkka: ");
			tid = Integer.parseInt(tidstreng);
		  }
		JOptionPane.showMessageDialog(null, "Da er du ute av loopen!");
	}

}