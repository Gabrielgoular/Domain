package com.goulartDev.domain.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goulartDev.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
