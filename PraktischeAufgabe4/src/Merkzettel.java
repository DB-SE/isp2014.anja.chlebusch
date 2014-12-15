import java.util.ArrayList;


public class Merkzettel implements Kundenliste{
	
	
	private static ArrayList <String> Kundenliste= new ArrayList<String>();

	@Override
	public void addKundenliste(String s) {
		if(s.equals("addMerkzettel_Jacke")){
			Kundenliste.add("Jacke");
			
		}
		if(s.equals("addMerkzettel_Hose")){
			Kundenliste.add("Hose");
		}
		
	
	}

	@Override
	public String zeigeKundenliste() {
		StringBuilder strB;
		strB = new StringBuilder();
		System.out.println("Merkzettel:");
		for(int i = 0; i < Kundenliste.size() ;i++)
			strB.append("(" + i + ")"  + Kundenliste.get(i));
		return strB.toString();
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean isavailable(String s) {
		// TODO Auto-generated method stub
		return s.equals("addMerkzettel_Jacke")||s.equals("addMerkzettel_Hose");
	}

		
	}






		// TODO Auto-generated method stub

