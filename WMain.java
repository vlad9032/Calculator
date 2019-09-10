package pac1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WMain extends JFrame {
	private static long serialVersionUID = 1L;
	public WMain() {
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(330,200);
		setLocation(300,100);
		
		PData pField = new PData();
		JPanel pMain = new JPanel();
		pMain.add(pField);
		setLayout(new BorderLayout());
		add("Center",pMain);
		PCalcOper pb = new PCalcOper(pField);
		JPanel pButton = new JPanel();
		pButton.add(pb);
		add("East", pButton);
	}
	
}
