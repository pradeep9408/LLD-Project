package interfaces;

import booking.Booking;

public interface BookingOperations {

    void createBooking(Booking booking);

    void cancelBooking();
}
