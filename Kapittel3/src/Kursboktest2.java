//Oppg 2 - Kap 3

import javax.swing.JOptionPane;


public class Kursboktest2 
{
	public static void main( String [] args )
	{
		Kursbok2 bok = new Kursbok2();
		
		//Leser inn kursnavn
		String navn = JOptionPane.showInputDialog("Hva heter kurset?");
		
		//Viser hvilket kurs vi har opprettet kursbok for
		bok.visTittel(navn);

	}
}
