import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton binDec = new JButton();
	JButton binHex = new JButton();
	JButton decBin = new JButton();
	JButton decHex = new JButton();
	JButton hexBin = new JButton();
	JButton hexDec = new JButton();
//	private Binary bin;
	//private Hexadecimal hex;
	private Decimal dec;
	/*
	public Menu(Binary b, Hexadecimal h, Decimal d) {
		bin = b;
		hex = h;
		dec = d;
	}
	
	*/
	
	private void createUI() {
		frame.add(panel);
		panel.add(binDec);
		panel.add(binHex);
		panel.add(decBin);
		panel.add(hexBin);
		panel.add(hexDec);
	}
	
	void display() {
		frame.setVisible(true);
	}
}
