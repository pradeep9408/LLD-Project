package services;

import booking.Booking;
import interfaces.BookingOperations;

public class BookingService implements BookingOperations {

    @Override
    public void createBooking(Booking booking) {

        System.out.println("Booking Created Successfully");
        booking.displayBooking();
    }

    @Override
    public void cancelBooking() {

        System.out.println("Booking Cancelled");
    }
}