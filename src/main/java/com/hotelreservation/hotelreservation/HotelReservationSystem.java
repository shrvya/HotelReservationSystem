package com.hotelreservation.hotelreservation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
 * class to reserve hotels for customers
 */
public class HotelReservationSystem {
	List<Hotel> hotellist = new ArrayList<>();
	int workDays = 0, weekends = 0;
	int days;
	int rate;

	/*
	 * method to add hotel to ArrayList.name,rating and prices are added to
	 * arraylist hotellist hotelName is name of hotel rating is hotels rating
	 * 
	 */
	public void addHotels(String hotelName, int weekendRegularPrice, int weekdayRegularPrice, int ratings) {
		hotellist.add(new Hotel(hotelName, weekendRegularPrice, weekdayRegularPrice, ratings));
	}

	/*
	 * method takes check in and check out dates and calculates the number of days
	 * and find the hotel charging minimum price this method gives hotel with cheap
	 * price and best rating * @param checkin is date of Check in
	 * @param checkout is date of Check out
	 */
	public String cheapestHotel(Date checkin, Date checkout) {
		long difference = getTotalDays(checkin, checkout);
		int totalDays = (int) Math.abs(difference);
		workDays = workDays % 10;
		weekends = totalDays - workDays;
		int weekendCost, workdayCost;
		workdayCost = hotellist.get(0).weekdayRegularPrice * workDays;
		String cheapWorkdayHotel = hotellist.get(0).hotelName;
		weekendCost = hotellist.get(0).weekendRegularPrice * weekends;
		int totalCost = weekendCost + workdayCost;
		for (int index = 0; index < hotellist.size(); index++) {
			rate = hotellist.get(index).ratings;
			if (rate >= 3 && rate < 5) {
				workdayCost = hotellist.get(index).weekdayRegularPrice * workDays;
				weekendCost = hotellist.get(index).weekendRegularPrice * weekends;
				int temp = weekendCost + workdayCost;
				if ((temp > totalCost)) {

					cheapWorkdayHotel = hotellist.get(index).hotelName;
					totalCost = temp;
				}
			}
			if (rate < 3) {
				continue;
			}
		}
		return cheapWorkdayHotel;
	}

	public long getTotalDays(Date checkin, Date checkout) {
		workDays = getDays(checkin, checkout);
		long difference = (checkin.getTime() - checkout.getTime()) / 86400000;
		return difference;

	}

	/*
	 * method returns the name of best rated hotel
	 * @param checkin is date of Check in
	 * @param checkout is date of Check out
	 */
	public String bestRatedHotel(Date checkin, Date checkout) {
		long difference = getTotalDays(checkin, checkout);
		int totalDays = (int) Math.abs(difference);
		workDays = workDays % 10;
		weekends = totalDays - workDays;
		int weekendCost = 0, workdayCost = 0;
		String cheapWorkdayHotel = null;
		int totalCost = weekendCost + workdayCost;

		for (int index = 0; index < hotellist.size(); index++) {
			rate = hotellist.get(index).ratings;
			if (rate >= 5) {
				workdayCost = hotellist.get(index).weekdayRegularPrice * workDays;
				weekendCost = hotellist.get(index).weekendRegularPrice * weekends;
				int temp = weekendCost + workdayCost;
				cheapWorkdayHotel = hotellist.get(index).hotelName;
			}
		}
		return cheapWorkdayHotel;
	}

	/*
	 * method find the number of workdays ,it takes checkin and check out dates and
	 * returns the number of workdays,using this weekdays are calculated * @param
	 * checkin is date of Check in
	 * @param checkout is date of Check out
	 */
	public int getDays(Date checkin, Date checkout) {
		// TODO Auto-generated method stub
		Calendar start = Calendar.getInstance();
		start.setTime(checkin);
		Calendar end = Calendar.getInstance();
		start.setTime(checkout);
		do {
			// excluding start date
			start.add(Calendar.DAY_OF_MONTH, 1);
			if (start.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				++workDays;
			}
		} while (start.getTimeInMillis() < end.getTimeInMillis());

		return workDays;

	}
}