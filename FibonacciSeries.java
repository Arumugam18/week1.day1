package week1.day1;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		int f=0;
		int s=1;
		System.out.print(f+ ",");
		System.out.print(s);
		for (int i=2;i<8;i++) {
		int c=(f+s);
		f=s;
		s=c;
		System.out.print("," + c);
		}
		/*System.out.println(s);
		{
			c=(f+s);
			System.out.println(c);
			f=c;
		}*/
	}

}
