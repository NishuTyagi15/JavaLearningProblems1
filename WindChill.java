import java.util.Scanner;

public class WindChill {

	//Function to calculate windchill

	static void windChill(double t, double v) {

		double wc = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println(wc);
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		try {
			System.out.println("enter temperature in fahrenheit");
			double t = S.nextDouble();
			System.out.println("enter wind speed in miles per hour");
			double v = S.nextDouble();
			if (Math.abs(t) > 50 || v > 120 || v < 3) {
				System.out.println("enter correct input");
			} 
            else {
				windChill(t, v);
			}
        }
        catch (Exception e) {
			System.out.println("Enter Valid Input!");
		}
		S.close();
	}
}