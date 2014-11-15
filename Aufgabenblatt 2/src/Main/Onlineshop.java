package Main;
import java.util.Arrays;
import java.util.Scanner;

import Objects.AGB;
import Objects.FAQ;


public class Onlineshop {
	
public static void main (String []args) throws Exception{
	AGB AGB;
	FAQ FAQ;

	if(isFAQ(args)){
		FAQ=new FAQ();
	}
	else{
		FAQ=null;
	}
	if(isAGB(args)){
		AGB = new AGB();
	}
	else{
		AGB=null;
	}
	Scanner scan;
		scan = new Scanner(System.in);
		while (true) {
			String s = scan.next();
			if(!s.equals("FAQ")&&(!s.equals("AGB"))&&(!s.equals("close"))){
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
			if (s.equals("close")){
				scan.close();
				break;
			}
			
			
		}

	}

private static  boolean isAGB(String[] _args){
	if(_args==null){return false;}
	for(String s:Arrays.asList(_args)){
		if (s.equals("--AGB=true")){
			return true;
		}
	}
	return false;
}
private static boolean isFAQ(String[]_args){
	if(_args==null){
		return false;
	}
	for(String s:Arrays.asList(_args)){
		if(s.equals("--FAQ=true")){
			return true;
		}
	}
	return false;
}
}
