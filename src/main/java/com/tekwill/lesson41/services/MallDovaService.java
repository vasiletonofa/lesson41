package com.tekwill.lesson41.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MallDovaService {

    @Qualifier("patria")
    @Autowired
    CinemaService cinemaServicePatria;

    @Qualifier("cineplex")
    @Autowired
    CinemaService cinemaServiceCineplex;


    public void bookSeatCinemaCineplex(String personName) {
        cinemaServiceCineplex.bookSeat(personName);
    }

    public void bookSeatCinemaPatria(String personName) {
        cinemaServicePatria.bookSeat(personName);
    }

}
