import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Newsletter {
public void println(){

	  JFrame jf =new JFrame();
	  JLabel jl= new JLabel(new ImageIcon("./bin/newsletter.png"));
	  jf.getContentPane().add(jl);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.pack();
	  jf.setVisible(true);
	  System.out.println("Sie haben den Newsletter aboniert");
}
}
