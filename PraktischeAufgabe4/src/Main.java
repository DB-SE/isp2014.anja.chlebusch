

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		List<Werbung> werbungoptionen;
		
		List <Artikellisten> artikeloptionen;
		List<Kundenliste> kundenlist;

		List<InformationKatalog> informationen;
		List<Versandoptionen> versandoptionen;
		
		
		werbungoptionen= new ArrayList<Werbung>();
		werbungoptionen.add(new Newsletter());
		
		artikeloptionen= new ArrayList<Artikellisten>();
		artikeloptionen.add(new Artikekatalog());
		
		kundenlist= new ArrayList<Kundenliste>();
		kundenlist.add(new Merkzettel());
		
		versandoptionen= new ArrayList<Versandoptionen>();
		versandoptionen.add(new Morningexpress());
		versandoptionen.add(new Standardversand());
		versandoptionen.add(new Latenightexpress());
		
		informationen = new ArrayList<InformationKatalog>();
		informationen.add(new FAQ());
		informationen.add(new AGB());
	
		Scanner scan;
		scan = new Scanner(System.in);
		while (true) {
			String s = scan.next();
			boolean isPluginLoaded = false;
			for(InformationKatalog info:informationen){
				if(info.isavaible(s)){
					System.out.println(info.print());
					isPluginLoaded = true;
				}
			}
			boolean isPluginLoaded2=false;
			for(Versandoptionen versand:versandoptionen){
				if(versand.isavaible(s)){
					System.out.println(versand.print());
					isPluginLoaded2=true;
				}
			}
			
			boolean isPluginLoaded3=false;
			for(Artikellisten artikel:artikeloptionen){
				if(artikel.isavailable(s)){
					System.out.println(artikel.Artikelkatalog());

					isPluginLoaded3=true;
				}
				
			}
			boolean isPluginLoaded4=false;
			for(Kundenliste kunde:kundenlist){
				if(kunde.isavailable(s)){
					kunde.addKundenliste(s);
			        System.out.println(kunde.zeigeKundenliste());
					isPluginLoaded4=true;
		
				}}
			boolean isPluginLoaeded5=false;
			for(Werbung werbung:werbungoptionen){
				if(werbung.isavaible(s));
				System.out.println(werbung.print());
				isPluginLoaeded5=true;
			}
			
			

			if (s.equals("close")){
				scan.close();
				break;
			}
			
			
		}

	
	}

}
