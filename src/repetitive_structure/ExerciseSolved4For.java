package repetitive_structure;

import java.util.Scanner;

public class ExerciseSolved4For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min, max;
		
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		int sum = 0;
		
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
