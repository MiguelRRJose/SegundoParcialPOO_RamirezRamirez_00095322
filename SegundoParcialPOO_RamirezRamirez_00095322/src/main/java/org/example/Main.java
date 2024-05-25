package org.example;

public class Main {
    public static void main(String[] args) {
        String username = "usuario";
        PaymentConfig paymentConfig = new PaymentConfig(username);
        PaymentProvider stripeProvider = new StripeProvider();
        PaymentProvider squareProvider = new SquareProvider();
        PaymentProvider authorizeNetProvider = new AuthorizeNetProvider();
        PaymentProvider alipayProvider = new AliayProvider();
        PaymentProvider nicoProvider = new NicoProvider();
        paymentConfig.addProvider(stripeProvider);
        paymentConfig.addProvider(squareProvider);
        paymentConfig.addProvider(authorizeNetProvider);
        paymentConfig.addProvider(alipayProvider);
        paymentConfig.addProvider(nicoProvider);

        PaymentIntegration paymentIntegration = new PaymentIntegration(paymentConfig);

        paymentIntegration.processPayment(stripeProvider, 100.00);

        paymentIntegration.processPayment(alipayProvider, 200.00);
    }
}
