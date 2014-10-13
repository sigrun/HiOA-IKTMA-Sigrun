import javax.swing.JOptionPane;


public class oppgave6 {

	public static void main(String[] args) {
		String navn;
		String fødselsårString;
		int fødselsår;
		int årstall = 2014;
		int alder;
		
		// Leser inn navn og legger det i Stringen
		navn = JOptionPane.showInputDialog("Hei!\n" + "Hva heter du?");
		
		// Leser inn fødselsår og legger det i Stringen
		fødselsårString = JOptionPane.showInputDialog("Hvilket år ble du født " + navn + "?");
		
		//Konverterer sifferstrengene til tallverdier
		  fødselsår = Integer.parseInt(fødselsårString);
		
		//Beregner alder
		alder = årstall - fødselsår;
		
		// Skriver ut navn og alder
		String utskrift;
		utskrift = "Hei " + navn + ", i år fyller du " + alder + " år";
		JOptionPane.showMessageDialog(null, utskrift);
	}

}
