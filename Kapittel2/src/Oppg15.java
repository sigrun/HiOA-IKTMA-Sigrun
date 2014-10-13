 import javax.swing.JOptionPane;

public class Oppg15 {

	public static void main( String args[] )
	   {
	      String førsteSifferstreng;    // brukes ved innlesing
	      String andreSifferstreng;     // brukes ved innlesing
	      String tredjeSifferstreng;    // brukes ved innlesing
	      String resultat;              // tekststreng som brukes til utskrift

	      int førstetall;          // første tall som skal sammenliknes
	      int andretall;          // andre tall som skal sammenliknes
	      int tredjetall; 		 // tredje tall sommenlignes		
	      
	      førsteSifferstreng =
	         JOptionPane.showInputDialog( "Skriv første heltall:" );

	      andreSifferstreng =
	         JOptionPane.showInputDialog( "Skriv andre heltall:" );
	      
	      tredjeSifferstreng =
	 	     JOptionPane.showInputDialog( "Skriv tredje heltall:" );

	      // konverterer sifferstrenger til heltallsverdier
	      førstetall = Integer.parseInt( førsteSifferstreng );
	      andretall = Integer.parseInt( andreSifferstreng );
	      tredjetall = Integer.parseInt(tredjeSifferstreng);

	      // initialiserer utskriftsstrengen til at første tall er minst (hvis det er tilfelle)
	      resultat = førstetall + " er minst";

	      if ( ( førstetall > andretall ) && ( andretall < tredjetall ) )
	         resultat = andretall + " er minst ";

	      if ( ( førstetall > tredjetall ) && ( tredjetall < andretall) )
	         resultat = tredjetall + " er minst";

	      
	      // Viser resultat av sammenlikningene
	      JOptionPane.showMessageDialog( null, resultat, "Minste tall",
	         JOptionPane.INFORMATION_MESSAGE );
	   } // slutt på main-metoden
	} // slutt på klassen Sammenlikning