import javax.swing.JOptionPane;


public class Oppg2 {

	public static void main(String[] args) {
		
		int vekt;
		double porto = 0.0; //startverdi porto
		String sifferstreng; //tekststreng til innlesing og utskrift
		
		//leser inn streng
		sifferstreng = JOptionPane.showInputDialog("Skriv inn vekt:");
		
		//konverterer streng til tall
		vekt = Integer.parseInt(sifferstreng);
		
		if ( vekt <= 20 )
			porto = 10.00;
		
		else if ( vekt <= 50 )
			porto = 15.00;
			
		else if ( vekt <= 100 )
			porto = 19.00;
		
		else if ( vekt <= 350 )
			porto = 30.00;
		
		else if ( vekt <= 1000 )
			porto = 60.00;
		
		else if ( vekt <= 2000 )
			porto = 95.00;
		
		else
			JOptionPane.showMessageDialog(null, "Brevet er for tungt", "Porto", JOptionPane.INFORMATION_MESSAGE);	
		
		//skriver ut porto
		JOptionPane.showMessageDialog(null, "Portoen blir "+ porto + " kr", "Porto", JOptionPane.INFORMATION_MESSAGE);
	}

}
