package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
