/**
 * TODO description
 */
public class Main {
	public static void scannTest(String _eingabe){
		if(_eingabe.equals("Merkzettel")){
			System.out.println("Merkzettel ausgewählt");
		}

		else if(_eingabe.equals("addJacke")){
			String s= "Jacke";
			Merkzettel.add(s);
			
		}
		else if(_eingabe.equals("addHose")){
			String b= "Hose";
			Merkzettel.add(b);
		}
		else{
			original(_eingabe);
		}
	}
}