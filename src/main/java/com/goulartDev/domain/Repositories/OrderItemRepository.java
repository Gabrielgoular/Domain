package com.goulartDev.domain.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goulartDev.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
