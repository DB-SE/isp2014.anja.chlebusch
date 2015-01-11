import java.util.ArrayList;

/**
 * TODO description
 */
public class Merkzettel {
	public static ArrayList<String> Merkzettel= new ArrayList<String>();
	public static void add(String A){
//		ArrayList<String> Merzettel= new ArrayList<String>();
		Merkzettel.add(A);
		for(int i = 0; i < Merkzettel.size() ;i++)
			System.out.println("(" + i + ") " + Merkzettel.get(i));
		System.out.println();
	}

}