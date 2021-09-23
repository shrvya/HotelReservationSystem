package com.hotelreservation.hotelreservation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void checkHotel() {
		HotelReservationSystem hotelSystem = new HotelReservationSystem();

		assertEquals(true, hotelSystem.hotellist.add(new Hotel("Lakewood",110)));
		assertEquals(true, hotelSystem.hotellist.add(new Hotel("RidgeWood",  160)));
		assertEquals(true, hotelSystem.hotellist.add(new Hotel("BridgeWood", 220)));
	}
}
