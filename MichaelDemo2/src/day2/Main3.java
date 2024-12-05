package day2;

public class Main3 {

	public static void main(String[] args) {
		//3 essentail factors for a limit times of loop
		//way1:	certain time of loop				->  for
		//a.initial value
		//b.condition
		//c.increment
		
		//way2:	limit but don't know how many times	->	while
		//break the stop at some certain situation
		
		
		
		/*
		int i=1;				//a
		while(i<=times){		//b
			//do something
			//i++;				//c
		}
		*/
		
		
		/*
		 for(int i=1; i<=times;i++){
		 	//do something
		 }
		 */

		
		for(int i=100;i<1000;i++) {
			int a = i/100;//hundreds
			int b = i/10%10;// (i - a*100)/10;//tens
			int c = i%10;//ones
			
			if(a*a*a + b*b*b + c*c*c == i) {
				System.out.println(i);
			}
		}

		
	}

}



















