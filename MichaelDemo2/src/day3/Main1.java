package day3;

public class Main1 {

	// format code: ctrl + shift + f
	public static void main(String[] args) {

		int oddAddition = 0;
		int addition = 0;
		int i = 1; // loop variable
		//1+3+5+7+....+99
		while (i <= 100) {
			if (i % 2 != 0) {//odd
				// System.out.println(i);
				oddAddition = oddAddition + i;
			}
			addition += i;
			i++;
		}
		System.out.println(addition);
		System.out.println(oddAddition);
		
	}
}