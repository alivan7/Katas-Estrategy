package org.example;

import org.example.Kata6_Refactorized.PayPalProcessor;
import org.junit.jupiter.api.Test;

public class PayPalProcessorTest {
    @Test
    public void testPayPalPayment() {
        PayPalProcessor processor = new PayPalProcessor();
        processor.processPayPal(75.0);
    }
}
