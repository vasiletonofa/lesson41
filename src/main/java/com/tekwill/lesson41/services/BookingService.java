package com.tekwill.lesson41.services;

import java.util.*;
public interface BookingService {

    void book(String personName);

    List<String> getBookings();

}
