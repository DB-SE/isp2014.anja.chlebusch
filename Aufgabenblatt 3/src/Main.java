import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
public static void main (String []args) throws Exception{

	AGB AGB;
	FAQ FAQ;
	Versand Versand;
	Newsletter Newsletter;

	  
	  //#ifdef Newsletter
	  Newsletter= new Newsletter();
	  //#endif
    //#ifdef Versand
	Versand= new Versand();
	//#else
//@	Versand=null;
	//#endif
	//#ifdef FAQ
		FAQ=new FAQ();	
	//#else
//@		FAQ=null;
	//#endif
	//#ifdef AGB
		AGB = new AGB();
	//#else
//@		AGB=null;
	//#endif
	Scanner scan;
		scan = new Scanner(System.in);
		while (true) {
			String s = scan.next();
			if(!s.equals("FAQ")&&(!s.equals("AGB"))&&(!s.equals("close"))&&(!s.equals("Versand"))&&(!s.equals("Latenightexpress"))&&(!s.equals("Newsletter"))){
				System.out.println("Falsche Eingabe,bitte versuchen Sie es erneut");
			}
			if(s.equals("FAQ")){
				if(FAQ!=null){
					FAQ.printFAQ();
				}
				else{
					System.out.println("FAQ existieren nicht");
				}
			}
			if (s.equals("AGB")){
				if(AGB!= null){
					AGB.printAGB();
				}
				else{
					System.out.println("Fehler: AGB sind nicht vorhanden");
				}
			}
			if(s.equals("Versand")){
				ArrayList<String>optionenversand=new ArrayList<String>();
				String Latenightexpress = new String();
				String Morningexpress = new String();
				String Standardversand= new String();
				Latenightexpress="Latenightexpress";
				Morningexpress= "Morningexpress";
				Standardversand= "Standardversand";
				
				if(Versand!=null){
					System.out.println("Waehle Versandart");
					//#ifdef Latenightexpress
					optionenversand.add(Latenightexpress);
					//#endif
					//#ifdef Morningexpress
					optionenversand.add(Morningexpress);
					//#endif
					//#ifdef Standard
					optionenversand.add(Standardversand);
					//#endif

					for(int i = 0; i < optionenversand.size() ;i++)
						System.out.println("(" + i + ") " + optionenversand.get(i));
					System.out.println();
					}
				
				else{System.out.println("Fehler:Versand nicht vorhanden");}}
			
					if(s.equals("Latenightexpress")){
						//#ifdef Latenightexpress
						Versand.latenightexpress();
						//#else
//@						System.out.println("Diese Versandart ist nicht m?glich");
						//#endif
					}
					if(s.equals("Morningexpress")){
						//#ifdef Morningexpress
						Versand.morningexpress();
						//#else
//@						System.out.println("Diese Versandarte ist nicht moeglich");
						//#endif
					}
					if(s.equals("Standard")){
						//#ifdef Standard
						Versand.standardversand();
						//#else
//@						System.out.println("Diese Versandart ist nicht moeglich");
						//#endif
					}
					if(s.equals("Newsletter")){
						//#ifdef Newsletter
						Newsletter.println();
						//#else
//@						System.out.println("Newsletter existiert nicht");
						//#endif
						
					}
				
			
			if (s.equals("close")){
				scan.close();
				break;
			}
			
			
		}

	}



}
