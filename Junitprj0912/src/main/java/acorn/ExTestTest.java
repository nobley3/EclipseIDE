package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExTestTest {

	ExTest t = new ExTest();
	@Test
	void test() {
		//fail("Not yet implemented");
		 assertEquals(5, t.add(3,5));
	}

}
