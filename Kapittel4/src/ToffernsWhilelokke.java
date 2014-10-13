/*
Lag et applikasjonsprogram som leser inn vekten til et brev i antall hele gram og som skriver ut riktig porto (på grunnlag av portotabellen ovenfor).
Dersom brevet er for tungt, skal melding om dette skrives ut istedenfor portoen.
(Gjør bruk av if- og/eller if-else-setninger.) */

import javax.swing.JOptionPane;


public class ToffernsWhilelokke
{
    public static void main( String args[] )
    {
			int timar, minutt, sekund;

		    Integer tid = Integer.parseInt(JOptionPane.showInputDialog( "Skriv sekunder du ønsker å konvertere" ));
		    while ( tid >= 0 )
		    {
				minutt = tid / 60;
				timar = minutt / 60;
				minutt = minutt-(timar*60);
	 			sekund = tid-(timar*3600)-(minutt*60);

				String utskrift = timar + " t " + minutt + " m "+sekund+" s";
     			JOptionPane.showMessageDialog(null, utskrift);
     			// Sjekk om vi skal ha ny runde, spør om folket har fått nok...
		    	tid = Integer.parseInt(JOptionPane.showInputDialog( "Kor mange sekund vil du så oppgi? Velg negativt for å kome deg ut av denne skjærselden..." ));
		    }
		JOptionPane.showMessageDialog(null, "Takk for alt!");
    } // slutt på main-metoden
 } // slutt på klassen 