package org.example.oop.paymentcheckoutgateway;

public class Main {
    public static void main(String[] args){
        PaymentProcessor payment;
        payment = new CreditCardPayment();
        payment.pay(1000);
        payment = new UPIPayment();
        payment.pay(1500);
    }
}
