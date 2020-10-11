package com.bl.assignment;

import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{
	
	public T[] arguments;
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param arguments
	 */
	 
	@SafeVarargs
	public FindMaximum(T ...arguments) {
		this.arguments = arguments;
	}
	
	
	/**
	 * UC 4
	 * 
	 * @return
	 */
	 	
	public T findMax() {
		T findMax = findMax(arguments);
		return findMax;
	}
	
	@SafeVarargs
	static <T extends Comparable<T>> T  findMax(T ...arguments) {
		
		Arrays.sort(arguments);
		return arguments[arguments.length - 1];
	}

}
