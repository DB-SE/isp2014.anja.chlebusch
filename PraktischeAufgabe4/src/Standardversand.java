
public class Standardversand implements Versandoptionen {

	@Override
	public boolean isavaible(String s) {
		// TODO Auto-generated method stub
		return s.equals("Standardversand");	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Sie haben Standardversand gewählt";
	}

}
