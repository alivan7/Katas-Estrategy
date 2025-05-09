package org.example;

import org.example.Kata6_Refactorized.CryptoProcessor;
import org.junit.jupiter.api.Test;

public class CryptoProcessorTest {
    @Test
    public void testCryptoPayment() {
        CryptoProcessor processor = new CryptoProcessor();
        processor.processCrypto(250.0);
    }
}
