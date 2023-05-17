package com.tekwill.lesson41.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LibraryServiceLibrarius implements LibraryService {

    @Autowired
    BookingService bookingService;

    public LibraryServiceLibrarius(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void bookSeat() {
        bookingService.book("Vlad");
    }
}
