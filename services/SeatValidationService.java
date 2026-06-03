package services;

import interfaces.SeatValidator;

public class SeatValidationService implements SeatValidator {

    @Override
    public boolean validate(int seats) {

        if (seats > 50) {

            System.out.println("Maximum 50 seats allowed");
            return false;
        }

        return true;
    }
}