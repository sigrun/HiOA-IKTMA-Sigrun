import javax.swing.JOptionPane;
import javax.swing.JTextArea;

 public class Oppg5D
 {


 	public static void main(String[] args)
 	{

		//oppretter tekst området
		 JTextArea tekstomrade = new JTextArea();

		//initsialierer variabler
 		double potensverdien=0;
 		int start=0;
 		int stopp=11;


		//gir overskriftene i teksområdet
 		tekstomrade.setText("tallet\tandrepotens\ttredjepotens");

		//løkke for å telle opp til 10
 		for ( int i = start; i < stopp; i += 1 )
		  {
			//løkke for å beregne potensene
			for (int j=1; j<4; j++)
			{
				//utregning av potensverdiene
				potensverdien=Math.pow( i, j );
			//utskrift til tekstområdet
		    	tekstomrade.append(potensverdien + "\t");
	   		}

		     // tilføyer et linjeskift i tekstområdet
			tekstomrade.append("\n");

		  }
			//viser tekstområdet på skjermen
		   JOptionPane.showMessageDialog( null, tekstomrade,
		   "potenser", JOptionPane.INFORMATION_MESSAGE );
	}
  }