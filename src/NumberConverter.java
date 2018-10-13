import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberConverter {
	public static void main(String[] args) {
		//Converts decToBin and decToHex
		Decimal dec = new Decimal();
		
		//Converts binToDec and binToHex
		Binary bin = new Binary();
		
		//Converts hexToDec and hexToBin
		Hexadecimal hex = new Hexadecimal();
		
		//Create and displays menu

		Menu menu = new Menu(bin, hex, dec);
		menu.createUI();
	}
	
//	@Test
//	public void testDecimal() {
//		//Decimal dec = new Decimal();
//		//assertEquals("10001000001",dec.decToBin(1089));
//		//assertEquals("438",dec.decToHex(1080));
//	}
//	@Test
//	public void test() {
//		//Binary bin = new Binary();
//		
//	}
//	@Test
//	public void testHex() {
//		//Hexadecimal hex = new Hexadecimal();
//		//assertEquals(new Integer (60244), hex.hexToDec("EB54"));
//		//assertEquals("00111010", hex.hexToBin("3A"));
//	}

}