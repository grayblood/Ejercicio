import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HalloweenTest {

	@Test
	public void main() {
		int veg1 = 1;
		for (int i = 0; i < veg1; i++) {

			int casa = 89;
			int max = 7;
			int cara = 0;
			int cares = volte(casa, cara, max);
			System.out.println(cares);
			 assertEquals(351,cares);
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
