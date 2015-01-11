/**
 * TODO description
 */
public class Main {
	public static void scannTest(String _eingabe){

		if(_eingabe.equals("Versand")){
			System.out.println("Versand ausgewählt");
			Versand.printversand();
			
		}
		else{
			original(_eingabe);
		}
	}

}