package org.example;
import java.util.List;

public class PaymentIntegration {
    private PaymentConfig paymentConfig;

    public PaymentIntegration(PaymentConfig paymentConfig) {
        this.paymentConfig = paymentConfig;
    }

    public void processPayment(PaymentProvider provider, double amount) {
        String token = paymentConfig.getToken(provider);
        provider.processPayment(token, amount);
    }
}

