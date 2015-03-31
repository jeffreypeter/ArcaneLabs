package poc;

import static org.junit.Assert.*;
import jdbc.DatabaseConnection;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(JMockit.class)
public class JUnitTestingTest {

	@Test
	public void test1() {
		JUnitTesting obj = new JUnitTesting();
		int result = obj.testInt(0);
		assertEquals(-1, result);
		System.out.println("result:: "+result);
	}
	@Test
	public void test2() {
		JUnitTesting obj = new JUnitTesting();
		int result = obj.testInt(5);
		assertEquals(1, result);
		System.out.println("result:: "+result);
	}
	@Test
	public void test3(){
		JUnitTesting obj = new JUnitTesting();
//		new Expectations() {final DatabaseConnection con
//			{
//				con.getData(10);
//				returns(1000);
//			}
//		};
		new MockUp<DatabaseConnection>() {
		   @SuppressWarnings("unused")
		   @Mock
		   public int getData(int i ){
			   return i*i*i;
		   }
		  };
		int result = obj.testMock(10);
		assertEquals(1000, result);
		System.out.println("result:: "+result);
	}

}
