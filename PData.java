package pac1;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PData extends JPanel {
	private static long serialVersionUID = 1L;
	PField fieldA = null;
	PField fieldB = null;
	PField fieldC = null;
	
	public PData() {
		setLayout(new GridLayout(3,1));
		fieldA = new PField("a");
		add(fieldA);
		fieldB = new PField("b");
		add(fieldB);
		fieldC = new PField("c");
		add(fieldC);
	}
	public long getA() {
		return fieldA.getData();
	}
	public long getB() {
		return fieldB.getData();
	}
	public long getC() {
		return fieldC.getData();
	}
	public void setA(long value) {
		fieldA.setData(value);
	}
	public void setC(long value) {
		fieldC.setData(value);
	}
	
	
}
