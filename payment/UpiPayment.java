package payment;

import interfaces.Payment;

public class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("UPI Payment Successful");
        System.out.println("Amount Paid : " + amount);
    }
}