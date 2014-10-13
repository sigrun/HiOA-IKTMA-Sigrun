//Addisjonsprogram - leser inn og adderer to desimaltall.
//Utskrift viser gangestykket også

import javax.swing.JOptionPane;

public class oppgave3 {

	public static void main(String[] args) {
		
		  String sifferstreng1;// lagrer sifferstrengen som leses inn
		  String sifferstreng2;
		  double førstetall;
		  double andretall;
		  double sum; 
		  
		  //Leser inn første tall fra bruker vha en String
		  sifferstreng1 = JOptionPane.showInputDialog( "Skriv inn et desimaltall (bruk punktum, ikke komma)" );
		  //Leser inn neste tall fra bruker
		  sifferstreng2 = JOptionPane.showInputDialog( "Skriv inn etdesimaltall til" );
		  
		  //Konverterer sifferstrengene til tallverdier
		  førstetall = Double.parseDouble(sifferstreng1);
		  andretall = Double.parseDouble(sifferstreng2);
		  
		  //Adderer tallene og lagrer summen i variabelen sum
		  sum = førstetall + andretall;
		  
		  //Viser resultatet
		  JOptionPane.showMessageDialog(null, 
				  sifferstreng1 + " + " 
				+ sifferstreng2 + " = " 
				+ sum, 
				  "Resultater", JOptionPane.PLAIN_MESSAGE );
		  	} //Slutt på main metoden
}//slutt på klassen
