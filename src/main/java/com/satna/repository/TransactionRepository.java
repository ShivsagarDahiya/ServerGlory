package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findBySellerId(Long sellerId);
}
