package day4;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		double[] judges = new double[10];

		// auto complete
		// windows: alt+/ , ctrl+space
		// macbook: option+/ , control+space

		// format code: command + shift + F

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < judges.length; i++) {
			System.out.println("judge " + (i + 1) + " enter the grade:");
			judges[i] = scanner.nextDouble();
		}

		// final score:
		// (total score - max - min)/8
		double sum = 0;
		double min = judges[0];
		double max = judges[0];
		for (int i = 0; i < judges.length; i++) {
			sum += judges[i];

			if (min > judges[i]) {
				min = judges[i];
			}

			if (max < judges[i]) {
				max = judges[i];
			}

		}
		
		sum = sum - min - max;
		double finalScore = sum/8;
		System.out.println("min:"+min);
		System.out.println("the final score is:"+finalScore);
		
		

	}

}
