package week1.day1;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) how to use if condition 2) Use of
	 * modulo operator 3) How to use boolean variable 4) how to use break to break a
	 * loop
	 * 
	 */
	public static void main(String[] args) {

		int a = 13;
		int c;
		boolean b = false;
		for (int i = 2; i < a; i++) {
			c = a % i;
			if (c == 0) {
				b = true;
				break;
			}

		}
		if (b == false)
			System.out.print("Prime");
		else
			System.out.print("Not a Prime");
	}

}