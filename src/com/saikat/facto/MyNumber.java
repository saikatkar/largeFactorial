package com.saikat.facto;

/**
 * Customized number class.
 * first part represents the digit and the next one is the link to the next digitX
 * @author Saikat
 *
 */
public class MyNumber {
	
	private int digit;
	
	private MyNumber next;

	public int getDigit() {
		return digit;
	}

	public void setDigit(int digit) {
		this.digit = digit;
	}

	public MyNumber getNext() {
		return next;
	}

	public void setNext(MyNumber next) {
		this.next = next;
	}

}
