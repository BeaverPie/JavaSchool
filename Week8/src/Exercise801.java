import java.util.Random;
import java.util.Scanner;

public class Exercise801 {
	public static void main(String[] args) {

		Random rN = new Random();
		Scanner src = new Scanner(System.in);
		System.out.println("Please select a number from 1 to 10");

		int nr = rN.nextInt(10) + 1;
		int a;

		do {
			a = src.nextInt();
			if (a == nr) {
				System.out.println("Correct");
			} else if (a > nr) {
				System.out.println("Try lower");
			}

			else if (a < nr) {
				System.out.println("Try higher");
			} else
				return;

		} while (a != nr);
		src.close();
	}

}
