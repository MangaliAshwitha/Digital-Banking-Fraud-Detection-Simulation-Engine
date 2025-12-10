package com.example.transaction_api;

import org.springframework.web.client.RestTemplate;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionGenerator {

    public static void main(String[] args) {

        RestTemplate rest = new RestTemplate();

        Transaction t = new Transaction();
        t.setTransactionId(UUID.randomUUID().toString());
        t.setAmount(1200.50);
        t.setUser("Ashwitha");
        t.setStatus("SUCCESS");
        t.setDate(LocalDateTime.now().toString());
        t.setTimestamp(LocalDateTime.now().toString()); // FIXED

        String response = rest.postForObject(
                "http://localhost:8080/transaction",
                t,
                String.class
        );

        System.out.println("API Response: " + response);
    }
}
