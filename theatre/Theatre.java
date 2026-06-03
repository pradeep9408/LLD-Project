package theatre;
public class Theatre {

    private String theatreName;
    private int totalSeats;
    private int remainingSeats;

    public Theatre(String theatreName, int totalSeats, int remainingSeats) {
        this.theatreName = theatreName;
        this.totalSeats = totalSeats;
        this.remainingSeats = remainingSeats;
    }

    public int getRemainingSeats(int seatsBooked) {
        remainingSeats = totalSeats - seatsBooked;
        return remainingSeats;
    }
    public void displayTheatre() {
        System.out.println("Theatre Name : " + theatreName);
        System.out.println("Total Seats : " + totalSeats);
        System.out.println("Remaining Seats : " + remainingSeats);
    }
}