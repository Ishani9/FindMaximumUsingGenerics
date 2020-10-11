package com.bl.assignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaximumTest {
	
	FindMaximum findMaximum = new FindMaximum();
	// UC 1
	@Test
	public void givenThreeIntValue_whenFirstIsMax_returnFirst() {
		Integer first = 10;
		Integer second = -3;
		Integer third = 5;
		assertEquals(first, findMaximum.findMaxInt(first, second, third));
	}
	
	@Test
	public void givenThreeIntValue_whenSecondIsMax_returnSecond() {
		Integer first = 10;
		Integer second = 33;
		Integer third = 5;
		assertEquals(second, findMaximum.findMaxInt(first, second, third));
	}
	
	@Test
	public void givenThreeIntValue_whenThirdIsMax_returnThird() {
		Integer first = 10;
		Integer second = -3;
		Integer third = 55;
		assertEquals(third, findMaximum.findMaxInt(first, second, third));
	}
	
	//UC 2
	@Test
	public void givenThreeFloatValue_whenFirstIsMax_returnFirst() {
		Float first = 10f;
		Float second = -3f;
		Float third = 5f;
		assertEquals(first, findMaximum.findMaxFloat(first, second, third));
	}
	
	@Test
	public void givenThreeFloatValue_whenSecondIsMax_returnSecond() {
		Float first = 10f;
		Float second = 33f;
		Float third = 5f;
		assertEquals(second, findMaximum.findMaxFloat(first, second, third));
	}
	
	@Test
	public void givenThreeFloatValue_whenThirdIsMax_returnThird() {
		Float first = 10f;
		Float second = -3f;
		Float third = 55f;
		assertEquals(third, findMaximum.findMaxFloat(first, second, third));
	}
	

}
