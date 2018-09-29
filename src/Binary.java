
public class Binary {
	public int binToDec(String a) {
		int total = 0;
		int count = 0;
		for (int i = a.length()-1; i >= 0; i--) {
			int temp = a.charAt(i)-'0';
			int expo = (int) Math.pow(2, count);
			count++;
			total+=temp*expo;
		}
		return total;
	}
	
	public String binToHex(String a) {
		int total = 0;
		int count = 0;
		for (int i = a.length()-1; i >= 0; i--) {
			int temp = a.charAt(i)-'0';
			int expo = (int) Math.pow(2, count);
			int digit = (int) Math.pow(temp, expo);
			count++;
			total+=digit;
		}
		
		return ;
	}

}
