package com.goulartDev.domain.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;	

import com.goulartDev.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
