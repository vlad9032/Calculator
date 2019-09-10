package pac1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PField extends JPanel {
private static long serialVersionUID = 1L;
JTextField txtA = null;
long data;
JLabel lbAErr = null;
public PField(String title) {
	setLayout(new FlowLayout());
	JLabel lbA = new JLabel(title);
		add(lbA);
		txtA = new JTextField(10);
		add(txtA);
		lbAErr = new JLabel("Not a number");
		lbAErr.setForeground(Color.red);
		lbAErr.setVisible(false);
		txtA.addActionListener(new actList());
		txtA.addFocusListener(new CustomListener());
		add(lbAErr);
		}
public long getData() {
	getNumber();
	return data;
}
public void setData(long value) {
	data = value;
	txtA.setText(""+data);
}
private void getNumber() {
	try {
		data = Long.valueOf(txtA.getText());
		}
	catch(NumberFormatException ef) {
		lbAErr.setVisible(true);
	}
	}
	class actList implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			getNumber();
		}
	}
	class CustomListener implements FocusListener {
		public void focusGained(FocusEvent e) {
		}
		public void focusLost(FocusEvent e) {
			lbAErr.setVisible(false);
			getNumber();
			
		}
	}


}
