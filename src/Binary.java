import java.util.ArrayList;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

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
		int indexCount = 0;
		int remainder = a.length()%4;
		StringBuilder arr = new StringBuilder();
		for (int i = a.length()-1; i >= 0; i--) {
			
			int temp = a.charAt(i)-'0';
			int expo = (int) Math.pow(2, count);
			int digit = temp*expo;
			count++;
			total+=digit;
			//System.out.println("Digit: "+digit);
			//System.out.println("Total: "+total);
			indexCount++;
			if(indexCount==a.length() && remainder != 0) {
				switch (total) {
				case 10: 
					arr.append('A');
					break;
				case 11:
					arr.append('B');
					break;
				case 12:
					arr.append('C');
					break;
				case 13:
					arr.append('D');
					break;
				case 14:
					arr.append('E');
					break;
				case 15:
					arr.append('F');
					break;
				default:
					arr.append(total);
					break;
				}
			}
			if(((indexCount)%4 == 0) && (indexCount!=0)) {
				switch (total) {
				case 10: 
					arr.append('A');
					break;
				case 11:
					arr.append('B');
					break;
				case 12:
					arr.append('C');
					break;
				case 13:
					arr.append('D');
					break;
				case 14:
					arr.append('E');
					break;
				case 15:
					arr.append('F');
					break;
				default:
					arr.append(total);
					break;
				}
				count = 0;
				total = 0;
			}
		}
		arr.reverse();
		String end = arr.toString();
		//LOOK AT SYSTEMPRINTS
		return end;
	}

}
