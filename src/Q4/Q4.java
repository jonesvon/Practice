package Q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// Code that reads two integers
		// use a try/catch statement

		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Enter an integer to represent x");
		try {
			double x = Scan1.nextDouble();
			Scan1.nextLine();

			System.out.println("Enter an integer to represent y");
			double y = Scan1.nextDouble();
			Scan1.nextLine();

			System.out.println("The result is:" + (x / y));
		} catch (InputMismatchException e) {
			System.out.println("You entered an invalid input " + e);

		}

		Scan1.close();
	}

}
