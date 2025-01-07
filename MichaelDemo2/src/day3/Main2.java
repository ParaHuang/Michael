package day3;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		guess what it is?
//		input a number
//		too small/too big/it's right
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt(5));	//0~bound-1
//		System.out.println(random.nextInt(5,11)); //origin~bound-1
		
		
		
		int anwser = random.nextInt(1, 101);	//->generate a random number
//		
		while(true){		//for(;;)
			System.out.println("guess what it is?");
			int guess = scanner.nextInt();
			if(guess>anwser) {
				System.out.println("too big");
			}else if(guess<anwser) {
				System.out.println("too small");
			}else {
				System.out.println("it's right");
				break;	//interrupt the outside loop
			}
			
		}
			
	}

}
