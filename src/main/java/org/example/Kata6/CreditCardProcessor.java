package org.example.Kata6;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void processCreditCard(double amount) {
        System.out.println(STR."Processing credit card payment of $\{amount}");
    }

    @Override
    public void processPayPal(double amount) {
        throw new UnsupportedOperationException("Credit card processor doesn't support PayPal");
    }

    @Override
    public void processCrypto(double amount) {
        throw new UnsupportedOperationException("Credit card processor doesn't support Crypto");
    }
}
