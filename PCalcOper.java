package pac1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PCalcOper extends JPanel {
	private static long serialVersionUID = 1L;
	private PData pd = null;
	private long a;
	private long b;
	private long c;
	public PCalcOper(PData pd) {
		setLayout(new GridLayout(5,1));
		this.pd = pd;
		JButton buttonS = new JButton("c=a+b");
		buttonS.addActionListener(new addList());
		add(buttonS);
		JButton buttonR = new JButton("c=a-b");
		buttonR.addActionListener(new subList());
		add(buttonR);
		JButton buttonM = new JButton("c=a*b");
		buttonM.addActionListener(new multList());
		add(buttonM);
		JButton buttonD = new JButton("c=a/b");
		buttonD.addActionListener(new divList());
		add(buttonD);
		JButton buttonT = new JButton("a=c");
		buttonT.addActionListener(new transList());
		add(buttonT);
		}
	class addList implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			a = pd.getA();
			b = pd.getB();
			c = a + b;
			pd.setC(c);
		}
	}
	class subList implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			a = pd.getA();
			b = pd.getB();
			c = a - b;
			pd.setC(c);
		}
	}
	class multList implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			a = pd.getA();
			b = pd.getB();
			c = a * b;
			pd.setC(c);
		}
	}
	class divList implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			a = pd.getA();
			b = pd.getB();
			c = a / b;
			pd.setC(c);
		}
	}
	class transList implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			c = pd.getC();
			pd.setA(c);
		}
	}
	
	
}
