package com.satna.service;

import java.util.List;

import com.satna.model.Order;
import com.satna.model.Seller;
import com.satna.model.Transaction;
import com.satna.model.User;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
