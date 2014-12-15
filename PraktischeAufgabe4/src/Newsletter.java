import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Newsletter implements Werbung {
	public String print() {
		  JFrame jf =new JFrame();
		  JLabel jl= new JLabel(new ImageIcon("./bin/newsletter.jpg"));
		  jf.getContentPane().add(jl);
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jf.pack();
		  jf.setVisible(true);
		return "Sie haben den Newsletter aboniert";
	}

	@Override
	public boolean isavaible(String s) {
		// TODO Auto-generated method stub
		return s.equals("Newsletter");
	}

}
