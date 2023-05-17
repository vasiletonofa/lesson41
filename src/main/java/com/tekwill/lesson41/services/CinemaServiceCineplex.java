package com.tekwill.lesson41.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cineplex")
public class CinemaServiceCineplex implements CinemaService {

    @Autowired
    BookingService bookingServiceCinema; // 456

    @Override
    public void bookSeat(String personName) {
        bookingServiceCinema.book(personName);
    }
}
