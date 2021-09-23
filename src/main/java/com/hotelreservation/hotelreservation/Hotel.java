package com.hotelreservation.hotelreservation;

public class Hotel {
	String hotelName;
	int weekendRegularPrice;
	int weekdayRegularPrice;

	public Hotel(String hotelName, int weekendRegularPrice, int weekdayRegularPrice) {
		this.hotelName = hotelName;
		this.weekendRegularPrice = weekendRegularPrice;
		this.weekdayRegularPrice = weekdayRegularPrice;
	}

}