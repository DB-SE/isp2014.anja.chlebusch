
import java.util.Scanner;
/**
 * TODO description
 */
public class Main {

	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);
		while (true) {
			String s = scan.next();
			scannTest(s);
			if(s.equals("q")){
				return;
			}
		}
	}
	public static void scannTest(String _eingabe){
		System.out.println("Eingabe unbekannt");
	}
}