/**
 * TODO description
 */
public class Main {
	public static void scannTest(String _eingabe){

		if(_eingabe.equals("Versand")){
			System.out.println("Versand ausgew�hlt");
			Versand.printversand();
			
		}
		else{
			original(_eingabe);
		}
	}

}