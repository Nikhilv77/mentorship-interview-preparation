package org.example.oop.bankaccount;

public class Main {
 public static void main(String[] args){
     BankAccount account = new BankAccount(1000);
     account.deposit(200);
     System.out.println(account.getBalance());
     account.withdraw(400);
     System.out.println(account.getBalance());
     account.withdraw(-1);
     System.out.println(account.getBalance());
     account.withdraw(900);
     System.out.println(account.getBalance());
 }
}
