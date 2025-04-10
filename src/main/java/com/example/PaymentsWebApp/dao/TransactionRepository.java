package com.example.PaymentsWebApp.dao;

import com.example.PaymentsWebApp.Entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findByUserId(int userId);
}
