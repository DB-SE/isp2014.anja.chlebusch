import java.util.ArrayList;


public class FAQ implements InformationKatalog {
	private static String Frage1;
	private static String Frage2;
	private static String Antwort1;
	private static String Antwort2;
	private static ArrayList<String> FAQ=new ArrayList<String>();

	
	public String print(){
		Frage1="Was kostet der Versand?";
		Antwort1="\n    Innerhalb der EU:...,\n    Auﬂerhalb der EU:...,";
		Frage2="Wie lange dauert der Versand?";
		Antwort2="\n    EU:1-3 Werktage,...";
		FAQ.add(Frage1+Antwort1);
		FAQ.add(Frage2+Antwort2);
		StringBuilder strB;
		
		strB = new StringBuilder();
			
			for(int i = 0; i < FAQ.size() ;i++)
				strB.append("(" + i + ") " + FAQ.get(i));
			return strB.toString();
		}


	@Override
	public boolean isavaible(String s) {
		return s.equals("FAQ");
	}

}
