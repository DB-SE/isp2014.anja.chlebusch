import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * TODO description
 */
public class Main {

	public static void scannTest(String _eingabe){

		if(_eingabe.equals("Newsletter")){
			System.out.println("Newsletter ausgew�hlt");
			Newsletter.println();
			
		}
		else{
			original(_eingabe);
		}
	}


}