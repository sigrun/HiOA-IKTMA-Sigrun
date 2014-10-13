import javax.swing.JOptionPane;


public class Kursbok3 {
	
	private String kursnavn = "null";
	
	public void setKursnavn ( String navn)
	{
		kursnavn = navn;
	}
	public String getKursnavn()
	{
		return kursnavn;
	}
	public void visTittel()
	{
		JOptionPane.showMessageDialog(null, "Kursbok for " + kursnavn);
	}
	public void Ivar()
	{
		JOptionPane.showMessageDialog(null, "Ivar liker" + kursnavn  );
	}
	
}
