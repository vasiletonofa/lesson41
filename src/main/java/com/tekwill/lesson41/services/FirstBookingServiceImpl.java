package com.tekwill.lesson41.services;

import org.springframework.stereotype.Component;

import java.util.*;



public class FirstBookingServiceImpl implements BookingService {

    List<String> bookings1 = new ArrayList<>(); // 789 // 965

    @Override
    public void book(String personName) {
        bookings1.add(personName);
        System.out.println("Booked from FIRST implementation");

        // INSERT INTO bookings
    }

    @Override
    public List<String> getBookings() {

        // SELECT * FROM bookings
        return bookings1;
    }
}
