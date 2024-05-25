public class StripeProvider implements PaymentProvider {
    @Override
    public String getProviderName() {
        return "stripe";
    }

    @Override
    public void processPayment(String token, double amount) {
        System.out.println("Procesando pago con Stripe. Token: " + token + ", Monto: " + amount);
    }
}
public class SquareProvider implements PaymentProvider {
    @Override
    public String getProviderName() {
        return "square";
    }
    @Override
    public void processPayment(String token, double amount) {
        System.out.println("Procesando pago con Square. Token: " + token + ", Monto: " + amount);
    }
}

public class AuthorizeNetProvider implements PaymentProvider {
    @Override
    public String getProviderName() {
        return "authorize.net";
    }

    @Override
    public void processPayment(String token, double amount) {
        System.out.println("Procesando pago con Authorize.net. Token: " + token + ", Monto: " + amount);
    }
}
public class AlipayProvider implements PaymentProvider {
    @Override
    public String getProviderName() {
        return "alipay";
    }
    @Override
    public void processPayment(String token, double amount) {

        System.out.println("Procesando pago con Alipay. Token: " + token + ", Monto: " + amount);
    }
}

public class NicoProvider implements PaymentProvider {
    @Override
    public String getProviderName() {
        return "nico";
    }

    @Override
    public void processPayment(String token, double amount) {
        // Lógica para procesar el pago con nIco
        System.out.println("Procesando pago con nIco. Token: " + token + ", Monto: " + amount);
    }
}

