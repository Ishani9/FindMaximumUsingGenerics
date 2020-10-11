package com.bl.assignment;

public class FindMaximum <T extends Comparable<T>>{
	
	T first;
	T second; 
	T third;
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param first
	 * @param second
	 * @param third
	 */
	public FindMaximum(T first, T second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	
	/**
	 * UC 3 REFACTOR 2
	 * 
	 * @param <T>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	
	public T findMax() {
		return findMax(first, second, third);
	}
	
	static <T extends Comparable<T>> T  findMax(T first, T second, T third) {
		
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else
			return third;
	}

}
