import java.util.HashMap;

public class Decimal {
	
	public String decToBin(int x) {
		String bin = "";
		double testVal = 0;
		int power = 1;
		while (x-testVal > 0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2, power);
		for (int i=power; i>=0; i--) {
			if (x-Math.pow(2, i) >= 0) {
				x -= Math.pow(2, i);
				bin += "1";
			}
			else {
				bin += "0";
			}
		}
		return bin;
	}
	
	public String decToHex(int x) {
		HashMap<Integer, String> hexVals = new HashMap<Integer, String>();
		hexVals.put(15, "F");
		hexVals.put(14, "E");
		hexVals.put(13, "D");
		hexVals.put(12, "C");
		hexVals.put(11, "B");
		hexVals.put(10, "A");
		hexVals.put(9, "9");
		hexVals.put(8, "8");
		hexVals.put(7, "7");
		hexVals.put(6, "6");
		hexVals.put(5, "5");
		hexVals.put(4, "4");
		hexVals.put(3, "3");
		hexVals.put(2, "2");
		hexVals.put(1, "1");
		String hex = "";
		double testVal = 0;
		int power = 1;
		while (x-testVal>0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2,power);
		for (int i=power; i>=0; i--) {
			for (int j=15; j>0; j--) {
				if (x- j*(Math.pow(2, power)) > 0) {
					hex += 
				}
			}
		}
		return "hi";
	}
	
	

}
