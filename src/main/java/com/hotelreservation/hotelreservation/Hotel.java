package com.hotelreservation.hotelreservation;

public class Hotel {
	String hotelName;
	int weekendRegularPrice;
	int weekdayRegularPrice;
    int ratings;

	public Hotel(String hotelName, int weekdayRegularPrice, int weekendRegularPrice,int ratings) {
		this.hotelName = hotelName;
		this.weekdayRegularPrice = weekdayRegularPrice;
		this.weekendRegularPrice = weekendRegularPrice;
        this.ratings=ratings;
	}

}
