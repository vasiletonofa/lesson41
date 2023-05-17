package com.tekwill.lesson41;

import com.tekwill.lesson41.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class Lesson41Application implements CommandLineRunner {

	BookingService bookingService; // 456

	CinemaServicePatria cinemaServicePatria; // 657

	LibraryServiceLibrarius libraryServiceLibrarius; // 456

	MallDovaService mallDovaService;

	@Autowired
	public Lesson41Application(MallDovaService mallDovaService,
							   BookingService bookingService,
							   CinemaServicePatria cinemaServicePatria,
							   LibraryServiceLibrarius libraryServiceLibrarius) {
		this.mallDovaService = mallDovaService;
		this.bookingService = bookingService;
		this.libraryServiceLibrarius = libraryServiceLibrarius;
		this.cinemaServicePatria = cinemaServicePatria;
	}

	public static void main(String[] args) {
		SpringApplication.run(Lesson41Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		mallDovaService.bookSeatCinemaPatria("Vasile");
		mallDovaService.bookSeatCinemaCineplex("Artiom");

		List<String> bookings4 = bookingService.getBookings();

		for(String personName2: bookings4) {
			System.out.println(personName2);
		}
	}
}
