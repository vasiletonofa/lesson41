package com.tekwill.lesson41.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SecondBookingServiceImpl implements BookingService {

    List<String> bookings2 = new ArrayList<>();
    @Override
    public void book(String personName) {
        bookings2.add(personName);

        System.out.println("Booked from SECOND implementation");

        // mysql
    }

    @Override
    public List<String> getBookings() {
        return bookings2;
    }
}
