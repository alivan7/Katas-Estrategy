package org.example;

import org.example.Kata6_Refactorized.CreditCardProcessor;
import org.junit.jupiter.api.Test;

public class CreditCardProcessorTest {
    @Test
    public void testCreditCardPayment() {
        CreditCardProcessor processor = new CreditCardProcessor();
        processor.processCreditCard(100.0);
    }
}
