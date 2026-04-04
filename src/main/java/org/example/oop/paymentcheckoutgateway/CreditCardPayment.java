package org.example.oop.paymentcheckoutgateway;

public class CreditCardPayment implements PaymentProcessor {
    public void pay(double amount){
        System.out.println(amount + " Paid using Credit card.");
    }
}
