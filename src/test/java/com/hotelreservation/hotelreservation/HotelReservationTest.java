package com.hotelreservation.hotelreservation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void checkHotel() throws ParseException {
		HotelReservationSystem hotelSystem = new HotelReservationSystem();

		assertEquals(true,hotelSystem.hotellist.add(new Hotel("Lakewood", 110, 90, 3,80,80)));
		assertEquals(true,hotelSystem.hotellist.add(new Hotel("BridgeWood", 160, 60, 4,110,50)));
		assertEquals(true,hotelSystem.hotellist.add(new Hotel("RidgeWood", 220, 50, 5,100,50)));
		
		
	}
}
