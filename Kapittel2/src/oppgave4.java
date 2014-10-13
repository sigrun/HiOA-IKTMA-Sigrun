//Addisjonsprogram - leser inn og adderer to heltall.
//Utskrift viser gangestykket også

import javax.swing.JOptionPane;

public class oppgave4 {

	public static void main(String[] args) {
		
		  String sifferstreng1;// lagrer sifferstrengen som leses inn
		  String sifferstreng2;
		  int førstetall;
		  int andretall;
		  int sum; 
		  
		  //Leser inn første tall fra bruker vha en String
		  sifferstreng1 = JOptionPane.showInputDialog( "Skriv inn et heltall" );
		  //Leser inn neste tall fra bruker
		  sifferstreng2 = JOptionPane.showInputDialog( "Skriv inn et heltall til" );
		  
		  //Konverterer sifferstrengene til tallverdier
		  førstetall = Integer.parseInt(sifferstreng1);
		  andretall = Integer.parseInt(sifferstreng2);
		  
		  //Adderer tallene og lagrer summen i variabelen sum
		  sum = førstetall + andretall;
		  
		  //Viser resultatet
		  JOptionPane.showMessageDialog(null, 
				  sifferstreng1 + " + " 
				+ sifferstreng2 + "=" 
				+ sum, 
				  "Resultater", JOptionPane.PLAIN_MESSAGE );
		  	} //Slutt på main metoden
}//slutt på klassen
