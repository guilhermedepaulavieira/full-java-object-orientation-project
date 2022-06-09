package sequential_structure;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 0, resto, horas, minutos, segundos;

		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}
}
