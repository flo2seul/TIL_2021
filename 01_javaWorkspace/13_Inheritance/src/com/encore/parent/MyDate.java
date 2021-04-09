package com.encore.parent;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	// 1.Object가 가지고 있는 기능을 물려받았다.
	// 2. 그걸 자신에게 맞게 고쳐쓴다.

	/*
	 * public String toString() { return "MyDate [year=" + year + ", month=" + month
	 * + ", day=" + day + "]"; }
	 */

	public String getDate() {

		return year + "," + month + "," + day;
	}

}
