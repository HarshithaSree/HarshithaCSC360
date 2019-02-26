package com.assignment.cse360assign2;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator test = new Calculator();
test.add(4);
test.subtract(6);
test.multiply(2);
test.divide(2);
 String history =test.getHistory();
 System.out.println(history);


test.add(5);
test.subtract(5);
test.multiply(2);
test.divide(2);
test.getHistory();
String history1 =test.getHistory();
System.out.println(history1);
//test.divide(0);
 int total = test.getTotal();
 System.out.println("Total is :"+total);

	}

}
