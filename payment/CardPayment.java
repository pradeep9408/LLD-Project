package payment;

import interfaces.Payment;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Card Payment Successful");
        System.out.println("Amount Paid : " + amount);
    }
}