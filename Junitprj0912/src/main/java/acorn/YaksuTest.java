package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YaksuTest {

	Yaksu y = new Yaksu();
	@Test
	void testYYaksu() {
		//fail("Not yet implemented");
		assertArrayEquals(new int[]{1,2,3,6}, y.YYaksu(6));
	}

}
