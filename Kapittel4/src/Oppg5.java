/* Lag en ny versjon av porto-programmet du lagde for oppgave 2. 
 Den nye versjonen skal innlesing av brevets vekt og utskrift av porto utføres gjentatte ganger 
 inntil det leses inn en negativ verdi for vekten. */

import javax.swing.JOptionPane;


public class Oppg5 
{

	public static void main(String[] args) 
	{
		int vekt = 1;
		
		String utskrift;
		
	//leser inn streng sjekker om input er null
	String vektstreng = JOptionPane.showInputDialog("Skriv inn vekt:");
	if (vektstreng != null)
		
	//Ikke null, konverterer streng til tall
	 vekt = Integer.parseInt(vektstreng);
	
	while (vekt > 0)
	   {
		String tungt = "ikke"; //ToffernTips: antar først at brev "ikke" er for tungt
		double porto = 0.0;
		
		if ( vekt <= 20 )
			porto = 10.00;
		
		else if ( vekt <= 50 )
			porto = 15.00;
			
		else if ( vekt <= 100 )
			porto = 19.00;
		
		else if ( vekt <= 350 )
			porto = 30.00;
		
		else if ( vekt <= 1000 )
			porto = 60.00;
		
		else if ( vekt <= 2000 )
			porto = 95.00;
		
		else
			tungt = ""; //TT Brevet er for tungt og man tar bort "ikke" lenger ned i utskrift
		
		utskrift = "Brevet er " +tungt+ " for tungt. Porto "+porto;	
		JOptionPane.showMessageDialog(null, utskrift, "Porto", JOptionPane.INFORMATION_MESSAGE);	
		
		//Ny runde
		vektstreng = JOptionPane.showInputDialog("Skriv inn vekten på enda et brev:");
		if (vektstreng == null) break;
					
		//Ikke null, konverterer streng til tall
		else
		vekt = Integer.parseInt(vektstreng);
	   }
	JOptionPane.showMessageDialog(null, "Greit, you're out!",vektstreng, JOptionPane.INFORMATION_MESSAGE);		
	}

}
