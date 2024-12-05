package day1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//1.set up package
		//2.command + shift + o: import all necessary package, delete all unnecessary package
		
		System.out.println("please enter 2 integer number:");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();//user enter an integer number
		int num2 = scanner.nextInt();
		
		System.out.println("choose an operator:1.+  2.-  3.*   4./");
		int operator = scanner.nextInt();
		
		//make decisions
		//if..else...      
		/*
		if(statement1){
			operationsA
		}else if(statement2){
			operationsB
		}else if(statement3){
			operationsC
		}else{
			operationsD
		}
		
		 switch...case...
		//talking about several possible value of a variable
		switch(variable){
			case value1:
				operationsA;
				break;
			case value2:
				operationsB;
				break;
			case value3:
				operationsC;
				break;
			default:
				operationsD;
		}
		
		
		*/
		int result = 0;
//		if(operator == 1) {
//			result = num1+num2;
//		}else if(operator ==2) {
//			result = num1-num2;
//		}else if(operator ==3) {
//			result = num1*num2;
//		}else {
//			result = num1/num2;
//		}
//		
		switch(operator) {
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1-num2;
			break;
		case 3:
			result = num1*num2;
			break;
		case 4:
			result = num1/num2;
			break;
		default:
			System.out.println("invalid operator");
			return;
		}
		
		System.out.println("the result is:" + result);
		System.out.println("end of the program");
		
	}

}



















