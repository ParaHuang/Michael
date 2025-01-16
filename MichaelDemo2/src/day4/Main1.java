package day4;

import java.util.Random;


//calling a method   :   methodName(arugments);
public class Main1 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		Random random = new Random();

		for (int i = 0; i < ary.length; i++) {
			ary[i] = random.nextInt(-100, 101);
		}
		
		// 67 12 9 10 55 88 91 -98 ..

		int min = Math.abs(ary[0]);
		int max = Math.abs(ary[0]);

		System.out.println("the array elements are:");
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
			if (min > Math.abs(ary[i])) {
				min = Math.abs(ary[i]);
			}

			if (max < Math.abs(ary[i])) {
				max = Math.abs(ary[i]);
			}
		}
		// |-98| = 98
		// |91| = 91
		System.out.println("min absolute value:" + min);
		System.out.println("max absolute value:" + max);
	}

}
