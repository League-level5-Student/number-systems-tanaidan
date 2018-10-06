import java.util.HashMap;

public class Hexadecimal {
	
	public Integer hexToDec(String x) {
		HashMap<String, Integer> hexVals = new HashMap<String, Integer>();
		hexVals.put("F", 15);
		hexVals.put("E", 14);
		hexVals.put("D", 13);
		hexVals.put("C", 12);
		hexVals.put("B", 11);
		hexVals.put("A", 10);
		hexVals.put("9", 9);
		hexVals.put("8", 8);
		hexVals.put("7", 7);
		hexVals.put("6", 6);
		hexVals.put("5", 5);
		hexVals.put("4", 4);
		hexVals.put("3", 3);
		hexVals.put("2", 2);
		hexVals.put("1", 1);
		hexVals.put("0", 0);
		int decVal = 0;
		System.out.println("Length of string: " + x.length());
		for (int i=0; i<x.length(); i++) {
			decVal += hexVals.get(x.substring(i, i+1))*(Math.pow(16, x.length() - 1 - i));
			System.out.println(decVal);
		}
		return decVal ;
	}
	
	public String hexToBin(String x) {
		return x;
	}
}
