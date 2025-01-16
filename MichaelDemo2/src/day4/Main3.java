package day4;

public class Main3 {

	public static void main(String[] args) {
//		1.create an array, set up the length, but initial value (only default value)
//		type[] ary = new type[length];
//		double[] ary = new double[5];
		
//		2.create an array with initial value, which would also decides the length of array
//		type[] ary = new type[]{value1,value2,value3,value4};
		
//		3.shortcut for 2
//		type[] ary = {value1,value2,value3,value4};

//		int[] ary = new int[]{11,22,33,44};
		
		//			 0  1  2   3  4  5	
		int[] ary = {11,98,33,12,66,29};
		
		//print from the end to the front
		
		for(int i=ary.length-1 ; i>=0 ; i-- ) {
			System.out.println(ary[i]);
		}
		
		//i = i+1 ->  i+=1   ->  i++     /    ++i
		//i = i-1 ->  i-=1   ->  i--	 /	  --i
	}

}
