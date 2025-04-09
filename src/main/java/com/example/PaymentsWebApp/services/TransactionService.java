package com.example.PaymentsWebApp.services;

import com.example.PaymentsWebApp.Entity.TransactionEntity;
import com.example.PaymentsWebApp.dao.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<TransactionEntity> getTransactionsForUser(int userId) {
        return transactionRepository.findByUserId(userId);
    }
}
