package org.example.Kata6_Refactorized;

public class PayPalProcessor implements PayPalPayment{
    @Override
    public void processPayPal(double amount) {
        System.out.println(STR."Processed PayPal payment of $\{amount}");
    }
}
