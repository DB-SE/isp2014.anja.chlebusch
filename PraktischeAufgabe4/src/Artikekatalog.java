import java.util.ArrayList;


public class Artikekatalog implements Artikellisten{
	private static ArrayList<String> Artikelkatalog=new ArrayList<String>();
	@Override
		public String Artikelkatalog() {
			String Artikel1= new String ("Jacke");
			String Artikel2= new String("Hose");
			Artikelkatalog.add(Artikel1);
			Artikelkatalog.add(Artikel2);
			StringBuilder strB;
			
			strB = new StringBuilder();
				
				for(int i = 0; i < Artikelkatalog.size() ;i++)
					strB.append("\n (" + i + ") " + "Artikel "+ i +" : "+ Artikelkatalog.get(i)+"\n +addMerkzettel: "+Artikelkatalog.get(i));
				return strB.toString();
			}


	@Override
	public boolean isavailable(String s) {
		// TODO Auto-generated method stub
		return s.equals("Artikelkatalog");
	}




}
