package factories;

import booking.Booking;
import interfaces.NotificationService;
import interfaces.Payment;
import movies.Movie;
import notifications.EmailNotification;
import notifications.PushNotification;
import notifications.SmsNotification;
import payment.CardPayment;
import payment.UpiPayment;
import theatre.Screen;
import theatre.Theatre;
import users.User;

public class SimpleFactory {

    public static User createUser(int userId, String userName) {
        return new User(userId, userName);
    }

    public static Movie createMovie(int movieId, String movieName, int duration, double ticketPrice) {
        return new Movie(movieId, movieName, duration, ticketPrice);
    }

    public static Theatre createTheatre(String theatreName, int totalSeats, int remainingSeats) {
        return new Theatre(theatreName, totalSeats, remainingSeats);
    }

    public static Screen createScreen(int screenId) {
        return new Screen(screenId);
    }

    public static Booking createBooking(User user, Movie movie, int seatsBooked) {
        return new Booking(user, movie, seatsBooked);
    }

    public static Payment createPayment(String type) {
        if ("card".equalsIgnoreCase(type)) {
            return new CardPayment();
        }
        return new UpiPayment();
    }

    public static NotificationService createNotification(String type) {
        if ("sms".equalsIgnoreCase(type)) {
            return new SmsNotification();
        }
        if ("push".equalsIgnoreCase(type)) {
            return new PushNotification();
        }
        return new EmailNotification();
    }
}
