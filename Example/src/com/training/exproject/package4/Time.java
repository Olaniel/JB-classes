package com.training.exproject.package4;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void add(int h, int m, int s) {
		long currentTimeInSecond;
		long addTimeInSecond;

		currentTimeInSecond = hour * 60 * 60 + minute * 60 + second;
		addTimeInSecond = h * 60 * 60 + m * 60 + s;

		long allTime = currentTimeInSecond + addTimeInSecond;

		hour = (int) (allTime / (60 * 60));
		allTime = allTime - hour * 60 * 60;
		minute = (int) (allTime / (60));
		allTime = allTime - minute * 60;
		second = (int) allTime;

	}

}

// про неделатьность использования в таких классах сканера и принта