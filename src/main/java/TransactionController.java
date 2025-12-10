package com.example.transaction_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    private TransactionRepository repo;

    @PostMapping("/transaction")
    public String submitTransaction(@RequestBody Transaction t) {

        // Validation
        if (t.getAmount() <= 0) {
            return "Invalid transaction: amount must be greater than 0";
        }

        if (t.getUser() == null || t.getUser().isEmpty()) {
            return "Invalid transaction: user is required";
        }

        // Save to DB
        repo.save(t);

        return "Transaction saved successfully!";
    }
}
