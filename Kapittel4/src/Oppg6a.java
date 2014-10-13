	//sirkelradius og omkrets i while

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Oppg6a 
{

	public static void main(String[] args) 
	{
			
			  String radiusstring;// lagrer sifferstrengen som leses inn
			  double pi = 3.14;
			  double radius=0.0;
			  double sumAreal = 0, sumOmkrets; 
			  
			//Leser inn radius fra sirkel vha en String
			  radiusstring = JOptionPane.showInputDialog( "Skriv inn sirkelens radius, "
			  		+ "så skal jeg finne både omkrets og areal" );
			  if(radiusstring!=null)
				  
			  while (radius >= 0 ) 
			{
			 //Konverterer radius til tallverdier
			  radius = Double.parseDouble(radiusstring);
			  		  
			  //Adderer tallene og lagrer summen i variabelen sum
			  sumAreal = pi * (radius*radius);
			  sumOmkrets = 2 * pi * radius;
			
			  DecimalFormat formateringsobjekt = new DecimalFormat( "0.00" );
				String formatertAreal = formateringsobjekt.format( sumAreal );
				String formatertOmkrets = formateringsobjekt.format( sumOmkrets );
				
			  //Viser resultatet
			  String utskrift = "Arealet av sirkelen er: " + formatertAreal +"\n" +
					  			"Omkretsen er: " +formatertOmkrets;
					  JOptionPane.showMessageDialog(null, utskrift, 
					  "Resultater", JOptionPane.PLAIN_MESSAGE );
			
					  
				//Leser inn radius fra sirkel vha en String
				radiusstring = JOptionPane.showInputDialog( "Skriv inn neste radius du har målt: " );
				if(radiusstring==null) break;
				else radius = Double.parseDouble(radiusstring);//denne kjøres nå to ganger. Finnes annen måte? else continue?
			  }  	
			  JOptionPane.showMessageDialog(null, "No more? OK, you're out!");
	} //Slutt på main metoden
	
}//slutt på klassen

