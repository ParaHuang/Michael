package day2;

public class Main2 {

	public static void main(String[] args) {
		//1.find all the 3 digit narcissistic number
		//narcissistic number ： the cube of every digit  add together equals as this number itself. 
		//for instance: 153 = 1*1*1 + 5*5*5 + 3*3*3
		//854/10=85  85%10=5
		//1*1*1 + 2*2*2 + 3*3*3 != 123 
		int i=100;
		while(i<1000) {
			int a = i/100;//hundreds
			int b = i/10%10;// (i - a*100)/10;//tens
			int c = i%10;//ones
			
			if(a*a*a + b*b*b + c*c*c == i) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
		//i=7835   78
		//int x = i/1000;
		//int a = i/100%10;
		//int b = i/10%10;// (i - a*100)/10;//tens
		//int c = i%10;//ones
	}

}


















