import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberConverter {
	//public static void main(String[] args) {
		//Converts decToBin and decToHex
		Decimal dec = new Decimal();
		
		//Converts binToDec and binToHex
		//Binary bin = new Binary();
		
		//Converts hexToDec and hexToBin
		//Hexadecimal hex = new Hexadecimal();
		
		//Create and displays menu
		//Menu menu = new Menu(bin, hex, dec);
		//menu.display();
	//}
	
	@Test

	public void testDecimal() {
		Binary bin = new Binary();
		assertEquals("FF", bin.binToHex("11111110"));
	}
}