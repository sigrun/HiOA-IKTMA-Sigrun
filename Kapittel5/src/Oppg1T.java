/* OPPGAVETEKST:
Lag et program som beregner og skriver ut (i en dialogboks) summen
  2 + 4 + 6 + 8 + ... + 98    */

import javax.swing.JOptionPane;



public class Oppg1T
{
    public static void main( String args[] )
    {
		String utskrift = "";
		for ( int i = 2; i <= 100; i += 2 ){
			utskrift += i + "\n";
		}
		JOptionPane.showMessageDialog( null, utskrift );

    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)