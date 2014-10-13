import javax.swing.JOptionPane;

//Lag et program som leser inn 10 heltallsverdier fra brukeren 
//og skriver ut (i en dialogboks) den største verdien som ble lest inn.

public class Oppg2S {

	public static void main(String[] args) {
		//Definerer variabler
		String inputTXT="";
		int inputTALL=0, storsteTall=0;
		
	
		for (int i=0; i<10; i++)
		{
			inputTXT=JOptionPane.showInputDialog("Skriv et tall");
			inputTALL=Integer.parseInt(inputTXT);
			
			if (inputTALL>storsteTall);
				storsteTall=inputTALL;
		}
		String utskrift = "Største tallet du skrev inn var: "+ storsteTall;
		JOptionPane.showMessageDialog(null, utskrift);
	}

}
