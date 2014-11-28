import java.util.ArrayList;


public class AGB {
	private static String Lieferbedingungen;
	private static String Zahlungsbedingungen;
	private static ArrayList<String> AGB=new ArrayList<String>();

	
	public void printAGB(){
		Lieferbedingungen="Lieferbedingungen:...";
		Zahlungsbedingungen="Zahlungsbedingungen...";
		AGB.add( Lieferbedingungen);
		AGB.add(Zahlungsbedingungen);
			
			for(int i = 0; i < AGB.size() ;i++)
				System.out.println("(" + i + ") " + AGB.get(i));
			System.out.println();
		}
		}