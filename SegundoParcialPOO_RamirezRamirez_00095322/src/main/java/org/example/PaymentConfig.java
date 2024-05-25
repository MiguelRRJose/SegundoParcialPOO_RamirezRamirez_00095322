package org.example;

import java.util.HashMap;
import java.util.Map;

public class PaymentConfig {
    private String username;
    private Map<PaymentProvider, String> providerTokens;

    public PaymentConfig(String username) {
        this.username = username;
        this.providerTokens = new HashMap<>();
    }

    public void addProvider(PaymentProvider provider) {
        String token = username + ":" + provider.getProviderName();
        providerTokens.put(provider, token);
    }

    public String getToken(PaymentProvider provider) {
        return providerTokens.get(provider);
    }
}

