/*Lag et program som beregner og skriver ut summen av alle hele tall mellom to grenser som brukeren skriver inn. 
 * Programmet skal starte med å lese inn nedre og øvre grense for summen. 
 * Dersom innlest øvre grense er mindre enn eller lik nedre grense, 
 * skal programmet skrive ut en melding til brukeren om dette og deretter avslutte. 
 * Ellers skal programmet beregne nevnte sum - nedre grense skal tas med i summen, 
 * men ikke øvre grense - og summen skal skrives ut.
 */

import javax.swing.JOptionPane;
public class Oppg4 {

	public static void main(String[] args) 
	{
		//Definerer variablene 
		String regnestykket="";
		int inputMax=0, inputMin=0, sum=0;
		
		//Leser inn max og min fra bruker
		inputMax = heltallInput("Skriv et heltall (øvre grense)");
		inputMin = heltallInput("Skriv et heltall (nedre grense)");
		
		for (int i=inputMin; i<inputMax; i+=1)
		{
			sum+=i;
			if (i>inputMin) regnestykket += "+"; //Denne skjønte jeg ikke
			regnestykket +=i;
		}
		
			JOptionPane.showMessageDialog
			(null, "Alle tall summert sammen blir: " +sum+ "\n Regnestykket ser slik ut: " +regnestykket);
		
	}//slutt på main metoden
	
	// Oppretter ny metode - Skjønner overhodet ikke hva denne gjør!
	private static int heltallInput(String s){
		Integer inputTall=null;
		try{ inputTall = Integer.parseInt(JOptionPane.showInputDialog(s));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog( null, "Det var vel eit tal eg spurte om?" );
		}finally{  // Litt (?????????) Usikker på kva denne finally-gjer.
			return inputTall;
		}
	}

}
