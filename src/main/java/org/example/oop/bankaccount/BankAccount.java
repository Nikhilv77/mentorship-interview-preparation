package org.example.oop.bankaccount;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        if(initialBalance < 0){
            System.out.println("Amount must be greater than 0");
            this.balance = 0;
        }else{
            this.balance = initialBalance;
        }
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Only amount greater than 0 can be deposited");
            return;
        }
            balance += amount;
            System.out.println("Deposited amount: " + amount);
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("only amount greater than 0 can be withdrawn");
            return;
        }
            if(amount > balance){
                System.out.println("insufficient balance");
                return;
            }
                balance -= amount;
                System.out.println("withdrawn amount is : " + amount);
    }
    public double getBalance(){
        return balance;
    }
}
