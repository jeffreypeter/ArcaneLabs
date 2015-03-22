package tester;

import poc.TestJUnit;

public class JarTester {
	public static void main(String[] args) {
		TestJUnit obj = new TestJUnit();
		int result = obj.intReturn(5);
		System.out.println(result);
	}
}
