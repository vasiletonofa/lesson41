package com.tekwill.lesson41.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("patria")
public class CinemaServicePatria implements CinemaService {


    @Autowired
    BookingService bookingServiceCinema; // 456

    public CinemaServicePatria(BookingService bookingService) {
        this.bookingServiceCinema = bookingService;
    }

    public void bookSeat(String personName) {
        bookingServiceCinema.book(personName);
    }


}
