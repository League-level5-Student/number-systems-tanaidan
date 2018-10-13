import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton binDec = new JButton();
	JButton binHex = new JButton();
	JButton decBin = new JButton();
	JButton decHex = new JButton();
	JButton hexBin = new JButton();
	JButton hexDec = new JButton();
	private Binary bin;
	private Hexadecimal hex;
	private Decimal dec;

	public Menu(Binary b, Hexadecimal h, Decimal d) {
		bin = b;
		hex = h;
		dec = d;
	}
	

	
	void createUI() {
		frame.add(panel);
		panel.add(binDec);
		panel.add(binHex);
		panel.add(decBin);
		panel.add(decHex);
		panel.add(hexBin);
		panel.add(hexDec);
		binDec.setText("Binary to Decimal");
		binHex.setText("Binary to Hex");
		decBin.setText("Decimal to Binary");
		decHex.setText("Decimal to Hex");
		hexBin.setText("Hex to Binary");
		hexDec.setText("Hex to Decimal");
		display();
		frame.pack();
		binDec.addActionListener(this);
		binHex.addActionListener(this);
		decBin.addActionListener(this);
		decHex.addActionListener(this);
		hexBin.addActionListener(this);
		hexDec.addActionListener(this);
		
	}
	
	void display() {
		frame.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == binDec) {
			String a = JOptionPane.showInputDialog("Enter a number in binary: ");
			JOptionPane.showMessageDialog(binDec, bin.binToDec(a));
		}
		else if (e.getSource() == binHex) {
			String a = JOptionPane.showInputDialog("Enter a number in binary: ");
			JOptionPane.showMessageDialog(binHex, bin.binToHex(a));
		}
		else if (e.getSource() == decBin) {
			String a = JOptionPane.showInputDialog("Enter a number in decimal: ");
			JOptionPane.showMessageDialog(decBin, dec.decToBin(Integer.parseInt(a)));
		}
		else if (e.getSource() == decHex) {
			String a = JOptionPane.showInputDialog("Enter a number in decimal: ");
			JOptionPane.showMessageDialog(decHex, dec.decToHex(Integer.parseInt(a)));
		}
		else if (e.getSource() == hexBin) {
			String a = JOptionPane.showInputDialog("Enter a number in hexadecimal: ");
			JOptionPane.showMessageDialog(hexBin, hex.hexToBin(a));
		}
		else if (e.getSource() == hexDec) {
			String a = JOptionPane.showInputDialog("Enter a number in hexadecimal: ");
			JOptionPane.showMessageDialog(hexDec, hex.hexToDec(a));
		}
	}
}
