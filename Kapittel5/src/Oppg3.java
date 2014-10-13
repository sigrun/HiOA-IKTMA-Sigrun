/*Lag et program som leser inn 10 heltallsverdier fra brukeren 
 * og skriver ut (i en dialogboks) den største verdien som ble lest inn.
 */
import javax.swing.JOptionPane;


public class Oppg3 {

	public static void main(String[] args) {
		//Definerer variabler med nullstilling
		int inputTall=0, storsteTall=0, nestStorsteTall=0; 
		String utskrift="", innskrift; // 
		
		for (int i = 1; i <= 10; i += 1 )
		{
			//leser inn tall og konverterer
			inputTall = Integer.parseInt(innskrift = JOptionPane.showInputDialog("Skriv inn et heltall"));
			//kaller opp metoden for sammenligning
			if (inputTall>storsteTall)
			{
				nestStorsteTall = storste(storsteTall, nestStorsteTall);
				storsteTall = storste(inputTall, storsteTall);
			}
			else
				nestStorsteTall=storste(inputTall, nestStorsteTall);
			
		}
		//utskrift
		utskrift += " Høyeste innskrevne tall vrr " + storsteTall + "\n" +
		"Nest høyeste ble derfor: " + nestStorsteTall;
		JOptionPane.showMessageDialog(null, utskrift);
		
		//metode for sammenligning, må være typedeklarert for å kunne behandle tall
		//kall med to parametre
		private static int storste; int sisteTall; int storst;
		{
			//sjekker om sistetall er større
			if(sisteTall>storst)
				storst=sisteTall;
			//returnerer største tall
			return storst;
		}
	}
}