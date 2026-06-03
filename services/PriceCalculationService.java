package services;

public class PriceCalculationService {

    public double calculatePrice(int seats, double ticketPrice) {

        return seats * ticketPrice;
    }
}