//File:Calculator.java
//Class ID: 430
//Assignment No:2
//
//Description : The Calculator class provides methods to perform basic arithmetic operations 
// and also stores the history of those operations performed.
//
//https://github.com/HarshithaSree/HarshithaCSC360
//
package com.assignment.cse360assign2;

/**
 * The Calculator class provides methods to perform basic arithmetic operations
 * and also stores the history of those operations performed.
 *
 * https://github.com/HarshithaSree/HarshithaCSC360
 *
 * @author Harshitha Kalidindi
 * @version 1.0
 *
 */

public class Calculator {

	private int total;
	private String history;

	/**
	 * @constructor initializes the variables total and history.
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
		history = "0";
	}

	/**
	 * This method is will return the current Total
	 * 
	 * @return total This is the integer which is the current total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * This method will add the value to the total variable
	 * 
	 * @param value
	 *            This is the integer to be added to the total variable
	 */
	public void add(int value) {

		total = total + value;
		history = history + " + " + value;

	}

	/**
	 * This method will subtract the value from the total variable
	 * 
	 * @param value
	 *            This is the integer to be subtracted from the total variable
	 */
	public void subtract(int value) {

		total = total - value;
		history = history + " - " + value;

	}

	/**
	 * This method will multiply the value to the total variable
	 * 
	 * @param value
	 *            This is the integer to be multiplied to the total variable
	 */
	public void multiply(int value) {
		total = total * value;
		history = history + " * " + value;

	}

	/**
	 * This method will divide the total variable by the value
	 * 
	 * @param value
	 *            This is the integer that the total variable is divided by
	 */
	public void divide(int value) {
		if (value == 0) {
			history = history + " / " + value;
			total = 0;
		} else {
			history = history + " / " + value;
			total = total / value;
		}

	}

	/**
	 * This method will divide the total variable by the value
	 * 
	 * @return String This is the string that the shows the history of
	 *         operations performed on the total variable
	 */
	public String getHistory() {
		return history;
	}

}
