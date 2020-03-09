package com.epam.task7.behavioural.chainOfResponsibility;

public class Test {
	public static void main( String[] args ) {
		CumulativeMultiply sum1 = new CumulativeMultiply(1);
		System.out.println(sum1.multiply(10));
		CumulativeMultiply sum2 = new CumulativeMultiply(10);
		System.out.println(sum2.multiply(10));
	}
}
