 import javax.swing.JOptionPane;

public class Oppg13 {

	public static void main( String args[] )
	   {
	      String førsteSifferstreng;   // brukes ved innlesing
	      String andreSifferstreng;    // brukes ved innlesing
	      String resultat;        // tekststreng som brukes til utskrift

	      int førstetall;          // første tall som skal sammenliknes
	      int andretall;          // andre tall som skal sammenliknes
	      
	      førsteSifferstreng =
	              JOptionPane.showInputDialog( "Skriv første heltall:" );

	      andreSifferstreng =
	         JOptionPane.showInputDialog( "Skriv andre heltall:" );

	      // konverterer sifferstrenger til heltallsverdier
	      førstetall = Integer.parseInt( førsteSifferstreng );
	      andretall = Integer.parseInt( andreSifferstreng );

	      // initialiserer utskriftsstrengen til en tom streng
	      resultat = ""; //Denne skjønte jeg ikke, I tillegg til resulat=resultat

	      if ( førstetall == andretall )
	         resultat = førstetall + " er lik " + andretall;

	      if ( førstetall > andretall )
	         resultat = resultat +  andretall;

	      if ( førstetall < andretall  )
	         resultat = resultat + førstetall;

	      
	      // Viser resultat av sammenlikningene
	      JOptionPane.showMessageDialog( null, "Tallet " + resultat + " er minst",
	              "Sammenlikningsresultater",
	         JOptionPane.INFORMATION_MESSAGE );
	   } // slutt på main-metoden
	} // slutt på klassen Sammenlikning