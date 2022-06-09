package repetitive_structure;

import java.util.Scanner;

public class ExerciseSolved1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.println("crescent");
			} else {
				System.out.println("decrescent");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}
}
