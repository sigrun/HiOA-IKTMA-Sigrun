//sirkelradius
import javax.swing.JOptionPane;

public class oppgave5 {

	public static void main(String[] args) {
		
		  String radiusstring;// lagrer sifferstrengen som leses inn
		  double pi = 3.14;
		  double radius;
		  double sum; 
		  
		  //Leser inn radius fra sirkel vha en String
		  radiusstring = JOptionPane.showInputDialog( "Skriv inn sirkelens radius" );
		  
		  //Konverterer radius til tallverdier
		  radius = Double.parseDouble(radiusstring);
		  		  
		  //Adderer tallene og lagrer summen i variabelen sum
		  sum = pi * (radius*radius);
		  
		  if (radius >= 0)
		  {
			  sum = pi*radius*radius;
		  JOptionPane.showMessageDialog(null, "Areal: " + sum);
		  }
		  
		 
		  	} //Slutt på main metoden
}//slutt på klassen
