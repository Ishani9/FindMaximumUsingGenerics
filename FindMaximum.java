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
		printMax(findMax);
		return findMax;
	}
	
	@SafeVarargs
	static <T extends Comparable<T>> T  findMax(T ...arguments) {
		
		Arrays.sort(arguments);
		return arguments[arguments.length - 1];
	}
	
	
	/**
	 * UC 5
	 * 
	 * @param <T>
	 * @param maximum
	 */
	static <T> void printMax(T maximum) {
			System.out.println("Maximum among given parameters is : " + maximum);
		}

}
