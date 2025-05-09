package org.example.Kata6;

public interface PaymentProcessor {
    void processCreditCard(double amount);
    void processPayPal(double amount);
    void processCrypto(double amount);
}
