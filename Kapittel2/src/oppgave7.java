import javax.swing.JOptionPane;


public class oppgave7 {

	public static void main(String[] args) {
		
		String sekundString;
		int sekunder;
		int minutter;

		//Leser inn sekunder til en String
		sekundString = JOptionPane.showInputDialog ("Skriv inn antall sekunder");
		
		//Konvverterer SifferString til tall
		sekunder = Integer.parseInt(sekundString);
		
		//Regner om sekunder til minutter
		minutter = sekunder / 60;
		
		//Viser resultat
		JOptionPane.showMessageDialog(null, minutter + " minutt",
				  "Resultat", JOptionPane.PLAIN_MESSAGE );
		
	}

}
