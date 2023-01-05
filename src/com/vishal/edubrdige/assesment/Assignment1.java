package com.vishal.edubrdige.assesment;

import java.util.Arrays;
import java.util.List;

/*Write a Java Program to iterate ArrayList using for-loop, while-loop,
and advance forloop to get the result as shown below:*/
public class Assignment1 {
	public static void main(String[] args) {

		// Creating and initializing the ArrayList
		// Declaring object of integer type
		List<Integer> numbers = Arrays.asList(20, 30, 40);
		// Iterating using while loop
		System.out.println(3);
		System.out.println("While Loop:");
		int val = 0;
		while (numbers.size() > val) {
			System.out.println(numbers.get(val));
			val++;
		}
		// Iterating using advanced for loop that for-each loop
		System.out.println("Advanced For Loop:");
		for (Integer number : numbers) {
			System.out.println(number);
		}
		// Iterating using for loop
		System.out.println("For Loop:");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
