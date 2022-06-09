package repetitive_structure;

import java.util.Scanner;

public class ExerciseSolved3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			int result = i * N;

			System.out.println(i + " x " + N + " = " + result);
		}
	
		sc.close();
	}

}
