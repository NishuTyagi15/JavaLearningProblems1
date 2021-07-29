import java.util.Scanner;

public class Distance {

	//Function to calculate the value of distance
	 
	static void calculate(int x, int y) {
		System.out.println("Distance is " + Math.pow((x * x + y * y), 0.5));
	}

	public static void main(String[] args) {
		try {
			Scanner S = new Scanner(System.in);
			System.out.println("Enter value for x : ");
			int x = S.nextInt();
			System.out.println("Enter value for y : ");
			int y = S.nextInt();
			calculate(x, y);
			S.close();
		} 
		catch (Exception e) {
			System.out.println("Enter Integer Only");
		 }
	}
}