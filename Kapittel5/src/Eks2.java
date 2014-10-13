import javax.swing.JOptionPane;


public class Eks2 {

	public static void main(String[] args) {
		int årsforbruk = 100000;
		  int økning = 10000;
		  int sum = årsforbruk;

		  for ( int år = 2; år <= 5; år++ )
		  {
		    årsforbruk += økning;  //beregner ny verdi for årsforbruket
		    sum += årsforbruk;   //adderer det nye årsforbruket til totalsummen
		  }
		// viser resultater
	      JOptionPane.showMessageDialog( null, sum,
	         "Årsforbruk etter 5 år", JOptionPane.INFORMATION_MESSAGE );
	}

}
