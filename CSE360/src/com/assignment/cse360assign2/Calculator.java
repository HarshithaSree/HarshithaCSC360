//File:Calculator.java
//Class ID: 430
//Assignment No:2
//
//Description : The Calculator class provides methods to perform basic arithmetic operations 
// and also stores the history of those operations performed.
//
package com.assignment.cse360assign2;

/**
 * The Calculator class provides methods to perform basic arithmetic operations
 * and also stores the history of those operations performed.
 *
 * @author Harshitha Kalidindi
 * @version 1.0
 *
 */

public class Calculator {
	private int total;

	public Calculator() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * This method is will return the current Total
	 * 
	 * @return int This is the integer which is the current total
	 */
	public int getTotal() {
		return 0;
	}

	/**
	 * This method will add the value to the total variable
	 * 
	 * @param value
	 *            This is the integer to be added to the total variable
	 */
	public void add(int value) {

	}

	/**
	 * This method will subtract the value from the total variable
	 * 
	 * @param value
	 *            This is the integer to be subtracted from the total variable
	 */
	public void subtract(int value) {

	}

	/**
	 * This method will multiply the value to the total variable
	 * 
	 * @param value
	 *            This is the integer to be multiplied to the total variable
	 */
	public void multiply(int value) {

	}

	/**
	 * This method will divide the total variable by the value
	 * 
	 * @param value
	 *            This is the integer that the total variable is divided by
	 */
	public void divide(int value) {

	}

	/**
	 * This method will divide the total variable by the value
	 * 
	 * @return String This is the string that the shows the history of
	 *         operations performed on the total variable
	 */
	public String getHistory() {
		return "";
	}

}
