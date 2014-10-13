import javax.swing.JOptionPane;



public class oppgave8 {

	public static void main(String[] args) {
		
		//Deklarasjon av variabler
		String sekundString;
		int antallSekunder, timer, minutter, sekunder;
		
		//Leser inn sekunder til en String
		sekundString = JOptionPane.showInputDialog ("Skriv inn antall sekunder");
				
		//Konvverterer SifferString til tall
		antallSekunder = Integer.parseInt(sekundString);
		
		//Regner om sekunder til minutter
		timer = antallSekunder/3600;
		minutter = (antallSekunder%3600)/60;
		sekunder = antallSekunder - timer*3600 - minutter*60;
		
		
		//Viser resultat
		JOptionPane.showMessageDialog(null, timer + " timer " + minutter + " minutter og " + sekunder + " sekunder");
		
	}

}
