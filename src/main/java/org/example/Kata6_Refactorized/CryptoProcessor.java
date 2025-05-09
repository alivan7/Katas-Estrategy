package org.example.Kata6_Refactorized;

public class CryptoProcessor implements CryptoPayment{
    @Override
    public void processCrypto(double amount) {
        System.out.println(STR."Processed Crypto payment of $\{amount}");
    }
}
