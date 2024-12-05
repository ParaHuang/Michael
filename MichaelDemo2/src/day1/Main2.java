package day1;

public class Main2 {

	public static void main(String[] args) {
		//define variable
		//input output
		//operator
		//decisions ( if, switch)
		//loop (while,for,do...while)
		//array
		int a = 13;
		int b = 5;
		
		//operator:
		//math operator: +  -   *  /  %
		//relationship operator: >   >=    <   <=   ==   !=   (the result is true/false)
		//logical operator:  !    &&    all    (the result is true/false)
		//assignment operator: =  +=   -=   *=   /=  %=
		System.out.println(a/b);
		System.out.println(a%b);//remainder
		

		//! :not
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		//&& :and,  both side need to true, then the result is true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println();
		//|| :or,  any side is true, then the result is true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println();
		a += 8;		//a = a + 8;
		a -= 3;
		a *= 4;
		a /= 2;
		
		System.out.println(a);
		
		//math > relationship>logical>assignment
		System.out.println(8>3+4 && 8+5%3<10);
		boolean f = 8>3+4 && 8+5%3<10;
		System.out.println(f);
		
		//if a number is even number
	}

}

//if tomorrow is sunny day, and I get paid, then I go shopping
//tomorrow:   it's sunny day, I get paid, => do I do to shopping?  true
//tomorrow:   it's sunny day, I didn't get paid, => do I do to shopping?  false
//tomorrow:   it's raining day, I get paid, => do I do to shopping?  false


































