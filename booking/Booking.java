package booking;

import movies.Movie;
import users.User;

public class Booking {

    private User user;
    private Movie movie;
    private int seatsBooked;

    public Booking(User user, Movie movie, int seatsBooked) {
        this.user = user;
        this.movie = movie;
        this.seatsBooked = seatsBooked;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }
    public void displayBooking() {
        System.out.println("User : " + user.getUserName());
        System.out.println("Movie : " + movie.getMovieName());
        System.out.println("Seats : " + seatsBooked);
    }
}