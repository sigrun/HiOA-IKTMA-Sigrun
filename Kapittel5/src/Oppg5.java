/* OPPGAVETEKST:
Skriv et program som beregner og skriver ut andre og tredje potens av de hele tallene fra 0 til 10,
sammen med tallene selv, slik at du får en tabell tilsvarende det som er vist i dialogboksen i "boka". */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.*;

public class Oppg5 {

	public static void main(String[] args) {
		
		// Definerer variabler
		Integer fra=0 , til=0;
		//Lag tekstområdet for tabellen
		JTextArea tabellen = new JTextArea();
		//Overskrift
		tabellen.setText("Grunntall\t Andre potens\t Tredje potens\n");
		
		//Loop til å sette inn tall i tabell
		for (int i=fra; i<til; i+=1)
		{
			//løkke for å beregne potensene
			
				tabellen.append(i+"\t");
				tabellen.append( (int)Math.pow(i,2) + "\t" ); //?
				tabellen.append( (int)Math.pow(i,3) + "\t" ); //??				
			

		}
		//Tabellen skrives ut i en dialogboks
		JOptionPane.showMessageDialog(null, tabellen);
	}//Slutt main

}//Slutt klasse
