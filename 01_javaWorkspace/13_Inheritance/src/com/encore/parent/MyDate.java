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
	// 1.Object�� ������ �ִ� ����� �����޾Ҵ�.
	// 2. �װ� �ڽſ��� �°� ���ľ���.

	/*
	 * public String toString() { return "MyDate [year=" + year + ", month=" + month
	 * + ", day=" + day + "]"; }
	 */

	public String getDate() {

		return year + "," + month + "," + day;
	}

}
