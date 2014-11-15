package Objects;
import java.util.ArrayList;


public class FAQ {
	private static String Frage1;
	private static String Frage2;
	private static String Antwort1;
	private static String Antwort2;
	private static ArrayList<String> FAQ=new ArrayList<String>();

	
	public void printFAQ(){
		Frage1="Was kostet der Versand?";
		Antwort1="\n    Innerhalb der EU:...,\n    Auﬂerhalb der EU:...,";
		Frage2="Wie lange dauert der Versand?";
		Antwort2="\n    EU:1-3 Werktage,...";
		FAQ.add(Frage1+Antwort1);
		FAQ.add(Frage2+Antwort2);
			
			for(int i = 0; i < FAQ.size() ;i++)
				System.out.println("(" + i + ") " + FAQ.get(i));
			System.out.println();
		}
		}
