/*Lag et program som leser inn 10 heltallsverdier fra brukeren 
 * og skriver ut (i en dialogboks) den største verdien som ble lest inn.
 */
import javax.swing.JOptionPane;


public class Oppg2 {

	public static void main(String[] args) {
		
		int inputTall, storsteTall = 0; // Hvorfor skrives Integer og ikke int?
		String innskrift =""; // Og Hvorfor står disse utefor løkken?
		
		for (int i = 1; i <= 10; i += 1 )
		{
			innskrift = JOptionPane.showInputDialog("Skriv inn et heltall");
			if (innskrift !=null)//Cancelknapp?
					{
					inputTall = Integer.parseInt(innskrift);
					}
			else break;
			if (inputTall>storsteTall) storsteTall=inputTall;
		}
		// Sjekker om det er skrevet inn større tall enn null
		if (storsteTall>0) JOptionPane.showMessageDialog(null, "Største tall du oppgav var: " + storsteTall);
		else JOptionPane.showMessageDialog(null, "Greit, da er du ute");
		System.out.println();
	}
}