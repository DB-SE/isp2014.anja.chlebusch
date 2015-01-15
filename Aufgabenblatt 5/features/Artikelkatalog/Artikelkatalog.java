import java.util.ArrayList;

/**
 * TODO description
 */
public class Artikelkatalog {


		public static void  printA() {
			ArrayList<String> Artikelkatalog=new ArrayList<String>();
			String Artikel1= new String ("Jacke");
			String Artikel2= new String("Hose");
			Artikelkatalog.add(Artikel1);
			Artikelkatalog.add(Artikel2);
			
			for(int i = 0; i < Artikelkatalog.size() ;i++)
				System.out.println("(" + i + ") " + Artikelkatalog.get(i));
			System.out.println();

			}
}