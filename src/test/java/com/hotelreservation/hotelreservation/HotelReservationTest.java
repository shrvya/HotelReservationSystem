package com.hotelreservation.hotelreservation;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void checkHotel() throws ParseException {
		HotelReservationSystem hotelSystem = new HotelReservationSystem();

		hotelSystem.hotellist.add(new Hotel("Lakewood", 110, 90, 3));
		hotelSystem.hotellist.add(new Hotel("BridgeWood", 160, 60, 4));
		hotelSystem.hotellist.add(new Hotel("RidgeWood", 220, 50, 5));
		int entry = hotelSystem.hotellist.size();
		assertEquals(3, entry);
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
		String entryHotel = hotelSystem.bestRatedHotel(formatter.parse("12Sep2020"), formatter.parse("19Sep2020"));
		assertEquals("RidgeWood", entryHotel);
	}
}
