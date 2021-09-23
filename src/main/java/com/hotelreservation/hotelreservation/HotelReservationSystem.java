package com.hotelreservation.hotelreservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
	List<Hotel> hotellist = new ArrayList<>();

	/*
	 * method to add hotel to ArrayList.name,rating and prices are added to
	 * arraylist hotellist hotelName is name of hotel rating is hotels rating
	 * 
	 */
	public void addHotels(String hotelName, int regularCustomePrice) {
		hotellist.add(new Hotel(hotelName, regularCustomePrice));
	}

	/*
	 * method takes check in and check out dates and calculates the number of days
	 * and find the hotel charging minimum price
	 */
	public void cheapestHotel(Date checkin, Date checkout) {

		long difference = (checkin.getTime() - checkout.getTime()) / 86400000;
		int days = (int) Math.abs(difference);
		if (days == 0) {
			days = 1;
		}
		int cost = hotellist.get(0).regularCustomePrice * days;
		String cheaphotel = hotellist.get(0).hotelName;
		for (int index = 0; index < hotellist.size(); index++) {
			if ((hotellist.get(index).regularCustomePrice * days) < cost) {
				cost = hotellist.get(index).regularCustomePrice * days;
				cheaphotel = hotellist.get(index).hotelName;
			}
		}
		System.out.println("The Cheapest hotel is " + cheaphotel + " with price " + cost);
	}
}