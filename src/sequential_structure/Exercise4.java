package sequential_structure;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 0, rest, hours, minutes, seconds;

		N = sc.nextInt();
		
		hours = N / 3600;
		rest = N % 3600;
		
		minutes = rest / 60;
		seconds = rest % 60;

		System.out.println(hours + ":" + minutes + ":" + seconds);

		sc.close();
	}
}
