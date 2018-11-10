package com.junit;

public class Math {

	public Math() {}
	
	int calculateSum(int[] numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
	
}
