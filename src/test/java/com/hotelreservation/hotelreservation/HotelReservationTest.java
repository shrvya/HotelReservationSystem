package com.hotelreservation.hotelreservation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void checkHotel() {
		HotelReservationSystem hotelSystem = new HotelReservationSystem();

		assertEquals(true, hotelSystem.hotellist.add(new Hotel("Lakewood", 3, 110, 80, 90, 80)));
		assertEquals(true, hotelSystem.hotellist.add(new Hotel("RidgeWood", 4, 160, 100, 60, 50)));
		assertEquals(true, hotelSystem.hotellist.add(new Hotel("BridgeWood", 5, 220, 100, 150, 40)));
	}
}
