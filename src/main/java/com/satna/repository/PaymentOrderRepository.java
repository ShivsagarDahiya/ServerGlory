package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {

    PaymentOrder findByPaymentLinkId(String paymentId);
}
