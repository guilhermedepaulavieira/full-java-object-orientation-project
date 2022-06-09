package conditioned_structure;

import java.util.Scanner;

public class StructureSwithCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		String dia;
		
//		if (x == 1) {
//			dia = "Sunday";
//		} else if (x == 2) {
//			dia = "Monday";
//		} else if (x == 3) {
//			dia = "Third";
//		} else if (x == 4) {
//			dia = "Fourth";
//		} else if (x == 5) {
//			dia = "Thursday";
//		} else if (x == 6) {
//			dia = "Friday";
//		} else if (x == 7) {
//			dia = "Saturday";
//		} else {
//			dia = "invalid value";
//		}
//		
//		System.out.println("Day of the week: " + dia);
		
		switch (x) {
		case 1:
			dia = "Sunday";
			break;
		case 2:
			dia = "Monday";
			break;
		case 3:
			dia = "Third";
			break;
		case 4:
			dia = "Fourth";
			break;
		case 5:
			dia = "Thursday";
			break;
		case 6:
			dia = "Friday";
			break;
		case 7:
			dia = "Saturday";
			break;
		default:
			dia = "invalid value";
			break;
		}
		
		System.out.println("Day of the week: " + dia);
		
		sc.close();
	}
}