import java.util.ArrayList;


public class AGB implements InformationKatalog{


		private static String Lieferbedingungen;
		private static String Zahlungsbedingungen;
		private static ArrayList<String> AGB=new ArrayList<String>();

		
	@Override
	public String print() {
		Lieferbedingungen="Lieferbedingungen:...";
		Zahlungsbedingungen="Zahlungsbedingungen...";
		AGB.add( Lieferbedingungen);
		AGB.add(Zahlungsbedingungen);
		StringBuilder strB;
		
		strB = new StringBuilder();
			
		
		for(int i = 0; i < AGB.size() ;i++)
			strB.append("(" + i + ") " + AGB.get(i));
		return strB.toString();
	}

	@Override
	public boolean isavaible(String s) {
		// TODO Auto-generated method stub
		return s.equals("AGB");
	}
	

}
