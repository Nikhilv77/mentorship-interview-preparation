package org.example.oop.paymentcheckoutgateway;

public class UPIPayment implements PaymentProcessor{
    public void pay(double amount){
        System.out.println(amount + " Paid using UPI.");
    }
}
