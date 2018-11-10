package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest {

	@Test
	public void test() {
		Math m = new Math();
		int result = m.calculateSum(new int[] {1,2,3});
		assertEquals(6, result);
			
	}

}
