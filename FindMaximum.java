package com.bl.assignment;

public class FindMaximum {
	
	/**
	 * UC 1
	 * 
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	
	public Integer findMax(Integer first, Integer second, Integer third) {
		
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else
			return third;
	}
}
