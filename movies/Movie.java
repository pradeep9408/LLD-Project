package movies;

public class Movie {

    private int movieId;
    private String movieName;
    private int duration;
    private double ticketPrice;

    public Movie(int movieId, String movieName,int duration, double ticketPrice) {

        this.movieId = movieId;
        this.movieName = movieName;
        this.duration = duration;
        this.ticketPrice = ticketPrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}