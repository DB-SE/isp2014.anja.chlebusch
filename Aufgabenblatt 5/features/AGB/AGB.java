import java.util.ArrayList;

/**
 * TODO description
 */
public class AGB {
	private static String Lieferbedingungen;
	private static String Zahlungsbedingungen;
	private static ArrayList<String> AGB=new ArrayList<String>();

	
	public static void printAGB(){
		Lieferbedingungen="Lieferbedingungen:...";
		Zahlungsbedingungen="Zahlungsbedingungen...";
		AGB.add( Lieferbedingungen);
		AGB.add(Zahlungsbedingungen);
			
			for(int i = 0; i < AGB.size() ;i++)
				System.out.println("(" + i + ") " + AGB.get(i));
			System.out.println();
		}
}