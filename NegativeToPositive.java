package week1.day1;

public class NegativeToPositive {
	public static void main(String[] args) {
		int a = -40;
		if (a < 0) {
			a = -1 * a;
			System.out.print("The number -" + a + " is converted to " + a);
		}

	}

}
