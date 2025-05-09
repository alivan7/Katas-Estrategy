package org.example.Kata6_Refactorized;

public class CreditCardProcessor implements CreditCardPayment{
    @Override
    public void processCreditCard(double amount) {
        System.out.println("Processed credit card payment of $" + amount);
    }
}
