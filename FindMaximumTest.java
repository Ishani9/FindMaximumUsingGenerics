package com.bl.assignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaximumTest {
	
	// UC 1
	@Test
	public void givenSixIntValue_whenSixthIsMax_returnSixth() {
		Integer first = 10;
		Integer second = -3;
		Integer third = 5;
		Integer forth = -5;
		Integer fifth = -15;
		Integer sixth = 100;
		assertEquals(sixth, new FindMaximum<Integer>(first, second, third, forth, fifth, sixth).findMax());
	}
	
	@Test
	public void givenFiveIntValue_whenSecondIsMax_returnSecond() {
		Integer first = 10;
		Integer second = 33;
		Integer third = 5;
		Integer forth = -5;
		Integer fifth = -15;
		assertEquals(second, new FindMaximum<Integer>(first, second, third, forth, fifth).findMax());
	}
	
	@Test
	public void givenThreeIntValue_whenThirdIsMax_returnThird() {
		Integer first = 10;
		Integer second = -3;
		Integer third = 55;
		assertEquals(third, new FindMaximum<Integer>(first, second, third).findMax());
	}
	
	//UC 2
	@Test
	public void givenFiveFloatValue_whenFirstIsMax_returnFirst() {
		Float first = 100.22f;
		Float second = -300f;
		Float third = 50.0f;
		Float forth = 4.54f;
		Float fifth = 5.44f;
		assertEquals(first, new FindMaximum<Float>(first, second, third, forth, fifth).findMax());
	}
	
	@Test
	public void givenFourFloatValue_whenSecondIsMax_returnSecond() {
		Float first = 10f;
		Float second = 33.0f;
		Float third = 5f;
		Float forth = 4.54f;
		assertEquals(second, new FindMaximum<Float>(first, second, third, forth).findMax());
	}
	
	@Test
	public void givenThreeFloatValue_whenThirdIsMax_returnThird() {
		Float first = 10f;
		Float second = -3f;
		Float third = 55.004f;
		assertEquals(third, new FindMaximum<Float>(first, second, third).findMax());
	}
	
	//UC 3
		@Test
		public void givenFourStringValue_whenFirstIsMax_returnFirst() {
			String first = "iI";
			String second = "A2";
			String third = "Ef";
			String forth = "aaaz";
			assertEquals(first, new FindMaximum<String>(first, second, third, forth).findMax());
		}
		
		@Test
		public void givenTwoStringValue_whenSecondIsMax_returnSecond() {
			String first = "SS";
			String second = "ZZZ";
			assertEquals(second, new FindMaximum<String>(first, second).findMax());
		}
		
		@Test
		public void givenThreeStringValue_whenThirdIsMax_returnThird() {
			String first = "A13";
			String second = "--4";
			String third = "Z234";
			assertEquals(third, new FindMaximum<String>(first, second, third).findMax());
		}
		

	

}
