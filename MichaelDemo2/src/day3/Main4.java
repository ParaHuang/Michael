package day3;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define an int array to save 10 numbers, input 10 number to save them into array one by one
		//print them all, then find out the max and min number
		int[] ary = new int[5];
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		for(int i = 0 ; i<ary.length ; i++) {
//			System.out.println("eneter a number:");
//			ary[i] = scanner.nextInt();
			ary[i] = random.nextInt(-100, 101);
		}
		
		int max = ary[0];//initial it as the first number
		int min = ary[0];
		System.out.println("the numbers you just entered are:");
		for(int i = 0 ; i<ary.length ; i++) {
			System.out.println(ary[i]);
			//Comparison
			if(max < ary[i]) {
				max = ary[i];
			}
			
			if(min > ary[i]) {
				min = ary[i];
			}
		}

		System.out.println("the max number is:"+max);
		System.out.println("the min number is:"+min);
		
		
		
	}

}
