package day3;

public class Main3 {

	public static void main(String[] args) {
		//type[] aryName = new type[length];
		//defined an array, the length is 5;
		int[] ary = new int[5];
		//index: 0 ~length-1
		ary[0] = 11;
		ary[1] = 22;
		ary[2] = 56;
		ary[3] = 99;
		ary[4] = 88;
//		System.out.println(ary[0]);
		//wrong
		//ary[5] = 100;
		
//		ary = new int[10];
//		System.out.println(ary[0]);

//		System.out.println(ary[0]);
//		System.out.println(ary[1]);
//		System.out.println(ary[2]);
//		System.out.println(ary[3]);
//		System.out.println(ary[4]);
		
		for(int i=0 ; i<ary.length ; i++){
			System.out.println(ary[i]);
		}
		
		
	}

}
