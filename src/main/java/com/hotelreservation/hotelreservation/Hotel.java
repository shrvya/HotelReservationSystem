package com.hotelreservation.hotelreservation;

public class Hotel {
	String hotelName;
	int weekendRegularPrice;
	int weekdayRegularPrice;
	int ratings;
	int weekdayRewardPrice;
	int weekendRewardPrice;

	public Hotel(String hotelName, int weekdayRegularPrice, int weekendRegularPrice, int ratings,
			int weekdayRewardPrice, int weekendRewardPrice) {
		this.hotelName = hotelName;
		this.weekdayRegularPrice = weekdayRegularPrice;
		this.weekendRegularPrice = weekendRegularPrice;
		this.ratings = ratings;
		this.weekdayRewardPrice = weekdayRewardPrice;
		this.weekendRewardPrice = weekendRewardPrice;
	}

}
