package com.bl.assignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaximumTest {
	
	FindMaximum findMaximum = new FindMaximum();
	
	@Test
	public void givenThreeIntValue_whenFirstIsMax_returnFirst() {
		Integer first = 10;
		Integer second = -3;
		Integer third = 5;
		assertEquals(first, findMaximum.findMax(first, second, third));
	}
	
	@Test
	public void givenThreeIntValue_whenSecondIsMax_returnSecond() {
		Integer first = 10;
		Integer second = 33;
		Integer third = 5;
		assertEquals(second, findMaximum.findMax(first, second, third));
	}
	
	@Test
	public void givenThreeIntValue_whenThirdIsMax_returnThird() {
		Integer first = 10;
		Integer second = -3;
		Integer third = 55;
		assertEquals(third, findMaximum.findMax(first, second, third));
	}

}
