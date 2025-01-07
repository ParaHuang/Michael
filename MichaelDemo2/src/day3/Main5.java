package day3;

public class Main5 {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
//				continue;	//skip the rest code of the current round of the loop
//				break;    	//interrupt the loop
				return;		//interrupt the program
			}
			System.out.println(i);
			
		}
		
		System.out.println("----end----");
		
	}
}
