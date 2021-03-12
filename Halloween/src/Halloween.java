
import java.util.Scanner;

public class Halloween {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {

			int casa = sc.nextInt();
			int max = sc.nextInt();
			int cara = 0;
			int cares = volte(casa, cara, max);
			System.out.println(cares);
		}
	}

	private static int volte(int casa, int cara, int max) {

		int bolsa = 0;

		if (casa != 0) {
			cara += 1;
			if (cara > max) {
				cara = 1;
			}
			casa -= 1;
			bolsa += cara + volte(casa, cara, max);

		} else {
			return bolsa;
		}
		return bolsa;

	}
}
