package org.example;

public interface PaymentProvider {
    String getProviderName();
    void processPayment(String token, double amount);
}
