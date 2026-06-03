import booking.Booking;
import factories.SimpleFactory;
import movies.Movie;
import services.BookingService;
import services.NotificationManager;
import services.PaymentService;
import services.SeatValidationService;
import theatre.Screen;
import theatre.Theatre;
import users.User;

public class Main {

    public static void main(String[] args) {

        User user = SimpleFactory.createUser(1, "Deepu");

        Movie movie = SimpleFactory.createMovie(101, "KGF 2", 180, 150);

        Theatre theatre = SimpleFactory.createTheatre("PVR", 50, 50);

        Screen screen = SimpleFactory.createScreen(1);

        int seats = 40;


        theatre.displayTheatre();
        screen.displayScreen();

        SeatValidationService validator = new SeatValidationService();

        BookingService bookingService = new BookingService();

        if (!validator.validate(seats)) {

            bookingService.cancelBooking();
            return;
        }

        Booking booking = SimpleFactory.createBooking(user, movie, seats);

        bookingService.createBooking(booking);

        
        PaymentService paymentService = new PaymentService(SimpleFactory.createPayment("upi"));

        double totalAmount = seats * movie.getTicketPrice();

        paymentService.makePayment(totalAmount);

        System.out.println("Remaining Seats : " + theatre.getRemainingSeats(seats));

        NotificationManager manager = new NotificationManager(SimpleFactory.createNotification("email"));

        manager.notifyUser("Movie Ticket Booked Successfully");

        NotificationManager manager2 = new NotificationManager(SimpleFactory.createNotification("sms"));
        manager2.notifyUser("Movie Ticket Booked Successfully");
    }
}