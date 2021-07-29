import java.lang.Math;
import java.util.Scanner;

public class Quadratic {
    static void roots(int a, int b, int c) {
		// calculating delta value
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);

	}

	//Main method to test the class
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		try {
			System.out.println("Enter a ");
			int a = S.nextInt();
			System.out.println("Enter b");
			int b = S.nextInt();
			System.out.println("Enter c");
			int c = S.nextInt();
			roots(a, b, c);
		} catch (Exception e) {
			System.out.println("Enter Correct Input");
		}
		S.close();
	}
}