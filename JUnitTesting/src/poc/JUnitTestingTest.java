package poc;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestingTest {

	/*@Test
	public void test1() {
		JUnitTesting obj = new JUnitTesting();
		int result = obj.testInt(0);
		assertEquals(100, result);
		System.out.println("result:: "+result);
	}*/
	@Test
	public void test2() {
		JUnitTesting obj = new JUnitTesting();
		int result = obj.testInt(5);
		assertEquals(1, result);
		System.out.println("result:: "+result);
	}

}
