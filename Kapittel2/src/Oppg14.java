//Delelig med tre
import javax.swing.JOptionPane;

public class Oppg14 {

	public static void main(String[] args) {
		String Sifferstreng;   // brukes ved innlesing
	    String resultat;        // tekststreng som brukes til utskrift

	      int tallet;          // tallet som skal være delelig med 3
	    
	      
	      Sifferstreng = JOptionPane.showInputDialog( "Skriv første et tall:" );

	      // konverterer sifferstrenger til heltallsverdier
	      tallet = Integer.parseInt( Sifferstreng );


	      // initialiserer utskriftsstrengen til en tom streng
	      resultat = ""; 

	      if ( (tallet%3)==0 )
	         resultat = tallet + " er delelig med 3 ";

	      if ( (tallet%3)!=0 )
		         resultat = tallet + " er ikke delelig med 3 ";

	      
	      // Viser resultat av sammenlikningene
	      JOptionPane.showMessageDialog( null, resultat,
	              "Sammenlikningsresultater",
	         JOptionPane.INFORMATION_MESSAGE );
	}

}
