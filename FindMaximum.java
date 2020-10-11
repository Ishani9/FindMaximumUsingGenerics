package com.bl.assignment;

public class FindMaximum {
	
	/**
	 * UC 3
	 * 
	 * @param <T>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	
	public  <T extends Comparable<T>> T  findMax(T first, T second, T third) {
		
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else
			return third;
	}

}
